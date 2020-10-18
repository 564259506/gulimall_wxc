package cn.wxc.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wxc.common.utils.PageUtils;
import cn.wxc.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author wxc
 * @email 564259506@qq.com
 * @date 2020-10-03 15:50:01
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

