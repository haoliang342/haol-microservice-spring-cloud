package com.haol.cloud.controller;

import com.haol.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Title: title
 * Description: [描述]
 * Created on 2019/3/29
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id")long id){
        //vip virtual Ip 虚拟ip
        //SpringApplicationName : microservice-provider-user
        return this.restTemplate.getForObject("http://microservice-provider-user/user/"+id, User.class);
    }

}
