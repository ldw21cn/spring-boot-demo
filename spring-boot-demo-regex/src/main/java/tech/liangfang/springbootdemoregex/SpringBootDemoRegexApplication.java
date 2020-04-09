package tech.liangfang.springbootdemoregex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.liangfang.springbootdemoregex.regex.WechatRegexConfig;

import java.util.List;

@SpringBootApplication
public class SpringBootDemoRegexApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoRegexApplication.class, args);
    }




}
