package cn.yangjrun.bookkeeping.config;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class ConfigConstValue {
    public static String TOKEN;

    @Value("${login.token-key}")
    public void setToken(String token) {
        ConfigConstValue.TOKEN = token;
    }

}
