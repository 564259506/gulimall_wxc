package cn.wxc.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wxc.common.utils.PageUtils;
import cn.wxc.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author wxc
 * @email 564259506@qq.com
 * @date 2020-10-03 15:23:09
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

