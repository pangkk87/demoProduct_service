package cn.blackboss.product_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * idea 小知识
 * edit config 不勾选single instance only
 * 换一个port 端口号 点击小虫子 即可启动多个实例
 *
 * 创建项目，选择Web ==》web 和 cloud discovery（服务的发现注册）
 *
 * 1 注册服务到注册中心  当有多个注册中心时，填写多个注册中心地址
 * eureka:
 *  client:
 *   serviceUrl:
 *    defaultZone: http://localhost:8761/eureka/
 * 2 给当前服务取服务名称 server-name
 * spring:
 * 	application:
 *   name: product-service
 *
 */
@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}

