package com.xkcoding.model.req;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 系统用户
 *
 * @author itar
 * @mail wuhandzy@gmail.com
 * @date 2020-05-15 09:05:44
 * @since jdk1.8
 */
@Setter
@Getter
public class SysUserReq implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long id;
    /**
     *
     */
    private String username;
    /**
     *
     */
    private String password;
}
