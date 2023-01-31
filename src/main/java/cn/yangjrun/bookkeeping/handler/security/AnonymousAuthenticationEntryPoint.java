package cn.yangjrun.bookkeeping.handler.security;

import cn.yangjrun.bookkeeping.commons.Result;
import cn.yangjrun.bookkeeping.util.ServletUtils;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 处理匿名用户无权访问
 */
@Component
public class AnonymousAuthenticationEntryPoint implements AuthenticationEntryPoint {

    //未登录时返回给前端数据
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException {
        ServletUtils.render(request,response, Result.error("需要登录"));
    }
}
