package com.haol.cloud.feign;

import com.haol.cloud.entity.User;
import com.haol.cloud.feign.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

/**
 * Title: title
 * Description: [描述]
 * Created on 2019/4/1
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@Component
@FeignClient(value = "microservice-provider-user", configuration = FeignConfig.class)
public interface UserFeignClient {

    @GetMapping("/user/{id}")
    User getUser(@PathVariable(value = "id")Long id);

    @PostMapping("/postuser")
    User postUser(@RequestBody User user);

    @PostMapping("/getList")
    List<User> getListUser();

    @PostMapping("/getUser")
    Map<String,Object> getUser();

}
