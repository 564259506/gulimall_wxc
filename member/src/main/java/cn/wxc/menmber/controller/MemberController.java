package cn.wxc.menmber.controller;

import java.util.Arrays;
import java.util.Map;


import cn.wxc.menmber.feign.CouponFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.wxc.menmber.entity.MemberEntity;
import cn.wxc.menmber.service.MemberService;
import cn.wxc.common.utils.PageUtils;
import cn.wxc.common.utils.R;

import javax.swing.*;


/**
 * 会员
 *
 * @author wxc
 * @email 564259506@qq.com
 * @date 2020-10-03 15:37:11
 */
@RestController
@RequestMapping("menmber/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    CouponFeign couponFeign;
    //cs
    @RequestMapping("/csM")
    public R cs(){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("张三");
        R cs = couponFeign.cs();
        Object coupons = cs.get("coupons");
        return R.ok().put("member",memberEntity).put("coupons",coupons);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("menmber:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("menmber:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("menmber:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("menmber:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("menmber:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
