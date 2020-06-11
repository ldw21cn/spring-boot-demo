package com.xkcoding.model.bo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 角色
 *
 * @author itar
 * @mail wuhandzy@gmail.com
 * @date 2020-05-15 09:05:42
 * @since jdk1.8
 */
@Setter
@Getter
public class SysRoleBo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    private Long id;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private String description;
}
