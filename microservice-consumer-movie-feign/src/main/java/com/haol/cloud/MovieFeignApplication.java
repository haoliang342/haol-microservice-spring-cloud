package com.haol.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@EnableFeignClients
@SpringBootApplication
public class MovieFeignApplication
{

    public static void main( String[] args )
    {

        SpringApplication.run(MovieFeignApplication.class, args);
    }
}
