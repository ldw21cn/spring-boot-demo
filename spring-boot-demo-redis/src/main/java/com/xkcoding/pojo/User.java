package com.xkcoding.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/6/16 14:49
 */
@Data
public class User implements Serializable {

    private String name;

    private String gender;

    private int age;

}
