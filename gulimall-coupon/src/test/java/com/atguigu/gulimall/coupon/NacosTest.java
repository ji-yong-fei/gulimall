package com.atguigu.gulimall.coupon;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingFactory;
import com.alibaba.nacos.api.naming.NamingService;

public class NacosTest {

    public static void main(String[] args) {
        String serverAddr = "http://124.221.29.191:8848";
        String serviceName = "gulimall-coupon";

        try {
            NamingService namingService = NamingFactory.createNamingService(serverAddr);
            namingService.registerInstance(serviceName, "127.0.0.1", 7000);
        } catch (NacosException e) {
            throw new RuntimeException(e);
        }
    }
}
