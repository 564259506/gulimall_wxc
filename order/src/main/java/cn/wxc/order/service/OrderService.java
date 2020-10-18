package cn.wxc.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wxc.common.utils.PageUtils;
import cn.wxc.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author wxc
 * @email 564259506@qq.com
 * @date 2020-10-03 15:44:11
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

