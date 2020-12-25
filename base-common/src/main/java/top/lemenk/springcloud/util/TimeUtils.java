package top.lemenk.springcloud.util;

import org.apache.commons.lang3.StringUtils;
import top.lemenk.springcloud.constant.CodeConstant;
import top.lemenk.springcloud.exception.CommonException;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Description 时间转化工具
 * @Author liuke@e6yun.com
 * @Created Date: 2020/12/18 14:33
 * @ClassName TimeUtils
 * @Remark
 */
public class TimeUtils {

    /**
     * date转换为固定格式的字符串
     *
     * @Author liuke@e6yun.com
     * @Date 2020/12/18 14:36
     * @param date 传入的时间
     * @param dtf 格式化参数  ex:DateTimeFormatter.ofPattern("yyyy.MM.dd");
     * @return java.lang.String
     **/
    public String dateToString(Date date, DateTimeFormatter dtf){
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
        return dtf.format(localDateTime);
    }

    /**
     * 字符串格式日期转化为date类型
     *
     * @Author liuke@e6yun.com
     * @Date 2020/12/18 14:38
     * @param timeStr 时间字符串
     * @param dtf 格式化参数
     * @return java.util.Date
     **/
    public Date stringToDate(String timeStr, DateTimeFormatter dtf){
        if (StringUtils.isEmpty(timeStr)){
            throw new CommonException(CodeConstant.ERROR_CODE, String.format("传入时间参数为空，timeStr = %s", timeStr));
        }
        LocalDate parse = LocalDate.parse(timeStr, dtf);
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.of(parse, localTime);
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        return Date.from(instant);
    }
}
