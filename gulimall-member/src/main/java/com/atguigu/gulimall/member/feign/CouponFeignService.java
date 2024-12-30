package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这是一个声明式的远程调用
 * 先去注册中心找到gulimall-coupon，再找到远程接口membercoupons
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    /**
     * 调用远程服务（远程接口）
     * @return
     */
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();

}
