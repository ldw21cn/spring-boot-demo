package com.xkcoding.model.po;

import java.io.Serializable;

/**
 * 用户与角色对应关系
 *
 * @author itar
 * @mail wuhandzy@gmail.com
 * @date 2020-05-15 09:05:46
 * @since jdk1.8
 */
public class SysUserRolePo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long id;
    /**
     *
     */
    private Long userId;
    /**
     *
     */
    private Long roleId;

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
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     *
     */
    public Long getUserId() {
        return userId;
    }

    /**
     *
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     *
     */
    public Long getRoleId() {
        return roleId;
    }
}
