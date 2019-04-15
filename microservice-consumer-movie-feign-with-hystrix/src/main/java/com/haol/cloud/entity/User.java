package com.haol.cloud.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Title: title
 * Description: [描述]
 * Created on 2019/3/26
 * Company: 东软软件股份有限公司
 *
 * @author 郝亮 - hao-l@neusoft.com
 */
@Data
public class User {

    private Long id;
    private String username;
    private String name;
    private Short age;
    private BigDecimal balance;
}
