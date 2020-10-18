package cn.wxc.coupon.dao;

import cn.wxc.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wxc
 * @email 564259506@qq.com
 * @date 2020-10-03 15:23:09
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
