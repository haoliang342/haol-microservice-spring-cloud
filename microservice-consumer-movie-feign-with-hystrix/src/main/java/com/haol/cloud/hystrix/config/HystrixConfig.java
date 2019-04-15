package com.haol.cloud.hystrix.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Title: title
 * Description: [描述]
 * Created on 2019/4/11
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@Configuration
public class HystrixConfig {

    @Bean
    public ServletRegistrationBean getServlet(){

        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();

        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);

        registrationBean.setLoadOnStartup(1);

        registrationBean.addUrlMappings("/actuator/hystrix.stream");

        registrationBean.setName("HystrixMetricsStreamServlet");

        return registrationBean;
    }

}
