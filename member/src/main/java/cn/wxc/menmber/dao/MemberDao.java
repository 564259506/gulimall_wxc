package cn.wxc.menmber.dao;

import cn.wxc.menmber.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wxc
 * @email 564259506@qq.com
 * @date 2020-10-03 15:37:11
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
