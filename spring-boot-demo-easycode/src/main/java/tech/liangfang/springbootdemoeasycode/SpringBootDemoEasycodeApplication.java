package tech.liangfang.springbootdemoeasycode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("tech.liangfang.springbootdemoeasycode.dao")
public class SpringBootDemoEasycodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoEasycodeApplication.class, args);
    }

}
