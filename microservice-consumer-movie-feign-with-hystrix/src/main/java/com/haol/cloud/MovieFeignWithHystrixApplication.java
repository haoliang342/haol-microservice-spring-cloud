package com.haol.cloud;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */

@EnableFeignClients
@SpringBootApplication
public class MovieFeignWithHystrixApplication
{

    public static void main( String[] args )
    {

        SpringApplication.run(MovieFeignWithHystrixApplication.class, args);
    }

}
