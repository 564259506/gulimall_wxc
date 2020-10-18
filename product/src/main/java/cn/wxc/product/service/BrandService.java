package cn.wxc.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wxc.common.utils.PageUtils;
import cn.wxc.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author wxc
 * @email 564259506@qq.com
 * @date 2020-09-29 22:00:38
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

