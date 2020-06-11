package com.xkcoding.model.po;

import java.io.Serializable;

/**
 * 角色
 *
 * @author itar
 * @mail wuhandzy@gmail.com
 * @date 2020-05-15 09:05:42
 * @since jdk1.8
 */
public class SysRolePo implements Serializable {
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
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     */
    public String getName() {
        return name;
    }

    /**
     *
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     */
    public String getDescription() {
        return description;
    }
}
