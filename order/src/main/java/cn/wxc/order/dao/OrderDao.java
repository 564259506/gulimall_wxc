package cn.wxc.order.dao;

import cn.wxc.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wxc
 * @email 564259506@qq.com
 * @date 2020-10-03 15:44:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
