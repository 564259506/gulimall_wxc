package cn.wxc.menmber.feign;

import cn.wxc.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author:wxc
 * project: gulimall
 * ClassName: CouponFeign
 * Date: 2020/10/3 17:02 周六
 * yy:猥琐别浪，等我发育。
 */

@FeignClient("coupon")
public interface CouponFeign {
    @RequestMapping("/coupon/coupon/cs")
    public R cs();
}
