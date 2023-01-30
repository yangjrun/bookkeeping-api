package cn.yangjrun.bookkeeping.handler.security;

import cn.yangjrun.bookkeeping.commons.Response;
import cn.yangjrun.bookkeeping.util.ServletUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 退出登录的回调
 */
@Component
public class AuthenticationLogout implements LogoutSuccessHandler {

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
        ServletUtils.render(request,response, Response.error("注销成功"));
    }
}
