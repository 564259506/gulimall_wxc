package cn.wxc.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.wxc.common.utils.PageUtils;
import cn.wxc.common.utils.Query;

import cn.wxc.product.dao.CategoryDao;
import cn.wxc.product.entity.CategoryEntity;
import cn.wxc.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1.查出所有分类  (这里用categoryDao和baseMapper效果一样)
        List<CategoryEntity> entities = categoryDao.selectList(null);
        //List<CategoryEntity> entities1 = baseMapper.selectList(null);

        //2.组装成父子的树形结构
            //2.1先找到所有的一级分类，一级分类的父分类id==0
        List<CategoryEntity> collect = entities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).map(menu->{
            menu.setChilden(getChilens(menu,entities));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());

        return collect;
    }

    //递归方法: 查找所有菜单的子菜单
    private List<CategoryEntity> getChilens(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> childenCollect = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            //1.找到子菜单
            categoryEntity.setChilden(getChilens(categoryEntity,all));
            return categoryEntity;
        }).sorted((menu1,menu2)->{
           //2.菜单的排序
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());


        return childenCollect;

    }

}