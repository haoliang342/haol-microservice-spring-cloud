package com.haol.cloud.feign.config;

import feign.Logger;
import feign.Retryer;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.TimeUnit;

/**
 * Title: title
 * Description: 可使feign在远程调用失败后会进行重试。
 * Created on 2019/4/1
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
public class FeignConfig {

    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1),5);
    }

    @Bean
    Logger.Level feginLoggerLevel(){
        return Logger.Level.FULL;
    }
}
