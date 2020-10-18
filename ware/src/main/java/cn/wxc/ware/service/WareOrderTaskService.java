package cn.wxc.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wxc.common.utils.PageUtils;
import cn.wxc.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author wxc
 * @email 564259506@qq.com
 * @date 2020-10-03 15:50:01
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

