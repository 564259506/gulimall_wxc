package cn.wxc.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wxc.common.utils.PageUtils;
import cn.wxc.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 
 *
 * @author wxc
 * @email 564259506@qq.com
 * @date 2020-10-03 15:23:09
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

