package cn.wxc.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wxc.common.utils.PageUtils;
import cn.wxc.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author wxc
 * @email 564259506@qq.com
 * @date 2020-10-03 15:44:11
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

