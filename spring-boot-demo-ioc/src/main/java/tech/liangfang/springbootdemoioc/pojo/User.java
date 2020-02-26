package tech.liangfang.springbootdemoioc.pojo;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/2/21 22:32
 */
@Data
@Accessors(chain = true)
@Component
public class User implements Serializable {

    private static final long serialVersionUID = -6061634535029000445L;

    @Value("2")
    private Long id;
    @Value("user_name_2")
    private String UserName;
    @Value("note_2")
    private String note;

}
