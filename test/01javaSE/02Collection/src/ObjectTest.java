import java.util.Objects;

/**
 * @Author: JunYan
 * @Description:
 * @Date: Created in  2020/3/27
 * @company: com.junyan
 */
public class ObjectTest {
    public static void main(String[] args) {
        Object obj = new Object();
        boolean flag = Objects.equals(obj, obj);
        System.out.println(flag);
    }
}
