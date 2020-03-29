import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: JunYan
 * @Description:
 * @Date: Created in  2020/3/29
 * @company: com.junyan
 */
public class Test {
    public static void main(String[] args) {
        String a = "12";
        int intA = Integer.parseInt(a);

        int b = 1;
        Integer integerB = Integer.valueOf(b);
        Integer c = 12;
        int i = c.intValue();

        LocalDateTime now = LocalDateTime.now();
        String strNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(strNow);


    }
}
