package cn.wxc.menmber.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wxc.common.utils.PageUtils;
import cn.wxc.menmber.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 
 *
 * @author wxc
 * @email 564259506@qq.com
 * @date 2020-10-03 15:37:11
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

