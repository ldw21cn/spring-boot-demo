package com.xkcoding.pojo;

import lombok.Data;

import java.io.PipedReader;
import java.io.Serializable;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/26 15:01
 */
@Data
public class Result implements Serializable {

    private Integer status;

    private String data;
}
