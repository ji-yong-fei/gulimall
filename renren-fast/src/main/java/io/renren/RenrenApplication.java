/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class RenrenApplication {

//	跨域的小伙伴：后端的renrenfast项目config/Corsconfig中的注释打开！！！！！

	public static void main(String[] args) {
		SpringApplication.run(RenrenApplication.class, args);
	}

}