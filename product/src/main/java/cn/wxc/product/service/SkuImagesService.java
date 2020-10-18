package cn.wxc.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wxc.common.utils.PageUtils;
import cn.wxc.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author wxc
 * @email 564259506@qq.com
 * @date 2020-09-29 22:00:37
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

