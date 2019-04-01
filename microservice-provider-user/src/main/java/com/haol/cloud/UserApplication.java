package com.haol.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 *  将服务注册到eureka上
 */
/**
 * @EnableDiscoveryClient 注解 作用于多个服务发现组件，如 zookeeper
 * 而 @EnableEurekaClient 注解 只能作用于eureka服务发现组件
 */
@SpringBootApplication
@EnableEurekaClient
public class UserApplication
{
    public static void main( String[] args )
    {

        SpringApplication.run(UserApplication.class, args);
    }
}
