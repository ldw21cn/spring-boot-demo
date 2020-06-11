package com.xkcoding.model.po;

import java.io.Serializable;

/**
 * 系统用户
 *
 * @author itar
 * @mail wuhandzy@gmail.com
 * @date 2020-05-15 09:05:44
 * @since jdk1.8
 */
public class SysUserPo implements Serializable {
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

    /**
     *
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     */
    public Long getId() {
        return id;
    }

    /**
     *
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     */
    public String getPassword() {
        return password;
    }
}
