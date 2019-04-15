package com.haol.cloud.feign.hystrix;

import com.haol.cloud.entity.User;
import com.haol.cloud.feign.UserFeignClient;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Title: title
 * Description: [描述]
 * Created on 2019/4/3
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@Component
public class UserHystrixFallback implements UserFeignClient{
    @Override
    public User getUser(Long id) {
        User user = new User();
        user.setId(0L);
        return user;
    }

    @Override
    public User postUser(User user) {
        return null;
    }

    @Override
    public List<User> getListUser() {
        return null;
    }

    @Override
    public Map<String, Object> getUser() {
        return null;
    }
}
