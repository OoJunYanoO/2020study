import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: JunYan
 * @Description:
 * @Date: Created in  2020/3/28
 * @company: com.junyan
 */
public class SystemTest {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        int[] srcArray = {1, 2, 3, 4, 5};
        int[] destArray = new int[3];
        int[] ints = new int[]{1, 2, 3, 4, 5};
        System.arraycopy(srcArray, 2, destArray, 0, 3);
        System.out.println(Arrays.toString(destArray));
    }
}
