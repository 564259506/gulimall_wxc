package cn.wxc.menmber.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.wxc.common.utils.PageUtils;
import cn.wxc.menmber.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author wxc
 * @email 564259506@qq.com
 * @date 2020-10-03 15:37:11
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

