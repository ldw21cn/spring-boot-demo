package com.xkcoding.model.req;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 用户与角色对应关系
 *
 * @author itar
 * @mail wuhandzy@gmail.com
 * @date 2020-05-15 09:05:46
 * @since jdk1.8
 */
@Setter
@Getter
public class SysUserRoleReq implements Serializable {
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
}
