package tech.liangfang.springbootdemoredissession.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.OncePerRequestFilter;
import tech.liangfang.springbootdemoredissession.common.Constants;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/21 16:25
 */
@Configuration
public class SessionFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        Object o = request.getSession().getAttribute(Constants.SESSION_USER_ID);

        if (Objects.isNull(o)) {
            response.sendRedirect("/errorPage");
        }

        filterChain.doFilter(request, response);


    }
}
