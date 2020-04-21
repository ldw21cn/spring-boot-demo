package tech.liangfang.springbootdemoredissession.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.liangfang.springbootdemoredissession.common.Constants;

import javax.servlet.http.HttpSession;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/21 16:19
 */
@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login(@RequestBody String userId, HttpSession session) {
        session.setAttribute(Constants.SESSION_USER_ID, userId);
        return "Login Success";
    }

}
