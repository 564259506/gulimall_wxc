package cn.wxc.product.dao;

import cn.wxc.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wxc
 * @email 564259506@qq.com
 * @date 2020-09-29 22:00:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
