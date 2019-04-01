package com.haol.cloud.entity;


import lombok.Data;

import javax.persistence.*;
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
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private Short age;
    @Column
    private BigDecimal balance;
}
