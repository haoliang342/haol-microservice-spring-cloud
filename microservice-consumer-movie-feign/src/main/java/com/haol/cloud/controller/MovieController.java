package com.haol.cloud.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.haol.cloud.entity.User;
import com.haol.cloud.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Title: title
 * Description: [描述]
 * Created on 2019/3/26
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@RestController
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        return userFeignClient.getUser(id);
    }

    @GetMapping("/postUser")
    public User postUser(User user){
        return this.userFeignClient.postUser(user);
    }

    @GetMapping("/getUserList")
    public void getList(){
        List<User> list = this.userFeignClient.getListUser();
        for(User user:list){
            System.out.println(user.getId());
        }
    }

    @GetMapping("/getUser")
    public void  getUser(){
        //接收到的Map是LinkMapList类型，不是HashMap类型，需要转换
        Map<String,Object> map = this.userFeignClient.getUser();
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.convertValue(map.get("user"),User.class);
        System.out.println(user.getId());
    }

}
