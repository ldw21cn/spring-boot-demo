package com.xkcoding.https.config;

import org.apache.catalina.connector.Connector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/16 10:46
 */
@Configuration
public class HttpsConfiguration {
    @Value("${http-port}")
    private int port;

    @Value("${server.port}")
    private int sslPort;

    @Bean
    public ServletWebServerFactory servletContainer() {
        /*TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
            @Override
            protected void postProcessContext(Context context) {
                SecurityConstraint securityConstraint = new SecurityConstraint();
                //表示数据在传送过程中被加密
                // securityConstraint.setUserConstraint("CONFIDENTIAL");
                //表示被指定的Web资源不需要任何传输保证
                // securityConstraint.setUserConstraint("NONE");
                //表示客户机与服务器之间传送的数据在传送过程中不会被篡改
                securityConstraint.setUserConstraint("INTEGRAL");
                SecurityCollection collection = new SecurityCollection();
                collection.addPattern("/*");
                securityConstraint.addCollection(collection);
                context.addConstraint(securityConstraint);
            }
        };*/

        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(redirectConnector());
        return tomcat;
    }

    private Connector redirectConnector() {
        Connector connector = new Connector(TomcatServletWebServerFactory.DEFAULT_PROTOCOL);
        connector.setScheme("http");
        connector.setPort(port);
        connector.setSecure(false);
        connector.setRedirectPort(sslPort);
        return connector;
    }
}
