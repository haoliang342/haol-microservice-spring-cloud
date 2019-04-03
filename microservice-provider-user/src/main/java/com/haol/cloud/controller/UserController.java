package com.haol.cloud.controller;

import com.haol.cloud.entity.User;
import com.haol.cloud.repository.UserRepository;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
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
public class UserController {

    @Resource
    private UserRepository userRepository;

    @Resource
    private EurekaClient discoverClient;


    /**
     * @GetMapping 是组合注解 相当于
     *
     * @requestMapping(value="/xxx",mehtod = RequestMethod.GET)
     */
    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable(value = "id") Long id){
        return userRepository.findById(id).get();
    }

    @RequestMapping("/str")
    public String getString(){
        User user = new User();
        user.setAge((short) 20);
        user.setName("haol");
        return "test 666 asdas12312312312 sssss";
    }

     /**
       * @author: haol
       * @method
       * @description 获取当前服务的IP,端口
       * @date: 2019/3/28 18:41
        * @param
       * @return
      */
    @GetMapping("/eureka-instance")
    public String serviceUrl(){
        InstanceInfo instanceInfo = this.discoverClient.getNextServerFromEureka("MICROSERVICE-PROVIDER-USER",false);
        return instanceInfo.getHomePageUrl();
    }

    @PostMapping("/postuser")
    public User postUser(@RequestBody User user){
        return user;
    }


    @PostMapping("/getList")
    public List<User> getListUser(){
        User user1 = new User(1L,"haol1");
        User user2 = new User(2L,"haol2");
        User user3 = new User(3L,"haol3");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }

    @PostMapping("/getUser")
    public Map<String,Object> getUser(){
        User user = new User(1L,"haol");
        Map<String,Object> map = new HashMap<>();
        map.put("user",user);
        return map;
    }


}
