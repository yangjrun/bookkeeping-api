package cn.yangjrun.bookkeeping.service.consts;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author jirun.yang
 * @date 2020-03-12 10:23
 **/
public interface CommonConst {
    ZoneId CURRENT_ZONE_ID = ZoneId.of("Asia/Shanghai");
    ZoneOffset CURRENT_ZONE_OFFSET = OffsetDateTime.now(CURRENT_ZONE_ID).getOffset();
    Locale CURRENT_LOCALE = Locale.CHINESE;
    String DATE_PATTERN = "yyyy-MM-dd";
    DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd", CURRENT_LOCALE);
    String TIME_PATTERN = "HH:mm:ss";
    DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss", CURRENT_LOCALE);
    String DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", CURRENT_LOCALE);
}
