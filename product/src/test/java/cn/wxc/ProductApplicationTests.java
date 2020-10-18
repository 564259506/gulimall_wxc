package cn.wxc;

import cn.wxc.product.entity.BrandEntity;
import cn.wxc.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
class ProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
   public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("国庆中秋");
        brandEntity.setDescript("今年国庆和中秋同一天");
        brandService.save(brandEntity);
        System.out.println("保存成功了！");
    }

}
