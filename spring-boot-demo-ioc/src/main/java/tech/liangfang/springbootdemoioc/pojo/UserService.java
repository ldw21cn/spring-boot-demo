package tech.liangfang.springbootdemoioc.pojo;

import org.springframework.stereotype.Service;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/2/21 22:55
 */
@Service
public class UserService {

    public void printUser(User user) {
        System.out.println("编号：" + user.getId());
        System.out.println("用户名称：" + user.getUserName());
        System.out.println("备注：" + user.getNote());

    }
}
