package cn.yangjrun.bookkeeping.handler.security;

import cn.yangjrun.bookkeeping.commons.Response;
import cn.yangjrun.bookkeeping.util.ServletUtils;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录用户没有权限访问的处理
 */
@Component
public class AccessDeny implements AccessDeniedHandler {


    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e) throws IOException {
        ServletUtils.render(request,response, Response.error("无权访问"));
    }
}
