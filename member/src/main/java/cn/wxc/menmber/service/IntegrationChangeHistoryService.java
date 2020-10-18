package cn.wxc.menmber.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wxc.common.utils.PageUtils;
import cn.wxc.menmber.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author wxc
 * @email 564259506@qq.com
 * @date 2020-10-03 15:37:11
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

