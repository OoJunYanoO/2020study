import javax.naming.NameNotFoundException;
import javax.security.auth.callback.LanguageCallback;
import java.sql.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @Author: JunYan
 * @Description:
 * @Date: Created in  2020/3/27
 * @company: com.junyan
 */
public class DataTest {
    public static void main(String[] args) {
        /*
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate birthday = LocalDate.of(1994, 12, 19);
        System.out.println(birthday);
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        System.out.printf("%d年-%d月-%d日", year, month, day);
        now = LocalDate.now();
        LocalDate guessDay = LocalDate.of(2020, 3, 27);
        System.out.println(now.equals(guessDay));
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        LocalTime newTime = nowTime.plusHours(1);
        System.out.println(newTime);

        now = LocalDate.now();
        LocalDate newDate = now.plusYears(-1);
        System.out.println(newDate);

        now = LocalDate.now();
        LocalDate equalsDay = LocalDate.of(2020, 12, 19);
        LocalDate equalsDay2 = LocalDate.of(1994, 12, 19);
        if (now.isAfter(equalsDay2)) {
            System.out.println("生日已经过去了");
        } else if (now.isBefore(equalsDay2)) {
            System.out.println("生日还没有过");
        } else {
            System.out.println("今天是我生日");
        }
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println(zonedDateTime);

        String dateText = "20201219";
        LocalDate parseDate = LocalDate.parse(dateText, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parseDate);

        String formatDate = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(formatDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy:MM:dd");
        String formatDate2 = now.format(formatter);
        System.out.println(formatDate2);

        LocalDateTime localDateTime = LocalDateTime.now();
        String localDateTimeFormatter = localDateTime.format(DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss"));
        System.out.println(localDateTimeFormatter);

        LocalDateTime localDateTimeParse = LocalDateTime.parse(localDateTimeFormatter,DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm:ss"));
        System.out.println(localDateTimeParse);

        System.out.println(System.currentTimeMillis());
        */
        System.out.println("=============");
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime newTime = now.plusYears(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy--MM--dd HH--mm--ss");
        String newTimeText = newTime.format(formatter);
        System.out.println(newTimeText);
        System.out.println(now.getYear() + ":" + now.getMonthValue() + ":" + now.getDayOfMonth());

        LocalDateTime birthday = LocalDateTime.parse("1994-12-19 12:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(birthday);
    }

}
