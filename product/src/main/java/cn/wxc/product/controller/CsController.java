package cn.wxc.product.controller;

import cn.wxc.common.utils.R;
import cn.wxc.product.entity.BrandEntity;
import cn.wxc.product.service.impl.BrandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:wxc
 * project: gulimall
 * ClassName: CsController
 * Date: 2020/10/3 14:19 周六
 * yy:猥琐别浪，等我发育。
 */

@Controller
public class CsController {

    @Autowired
    BrandServiceImpl brandService;

    @RequestMapping("cs")
    public void cs(){
        String s="这是测试123";
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandEntity.setDescript("华为啊华为");
        brandService.save(brandEntity);
        System.out.println("保存成功！！！！");
//        return R.ok().put("brandEntity",brandEntity);
    }
}
