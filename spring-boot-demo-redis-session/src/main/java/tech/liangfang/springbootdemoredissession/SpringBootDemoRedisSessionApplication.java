package tech.liangfang.springbootdemoredissession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;

@SpringBootApplication
public class SpringBootDemoRedisSessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoRedisSessionApplication.class, args);
	}

}
