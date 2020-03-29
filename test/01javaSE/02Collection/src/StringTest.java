/**
 * @Author: JunYan
 * @Description:
 * @Date: Created in  2020/3/28
 * @company: com.junyan
 */
public class StringTest {
    public static void main(String[] args) {
        String str = "a";
        String str2 = str + "b";
        String str3 = "ab";
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str2 == str);
        System.out.println(str3 == str2);
        char c = str3.charAt(0);
        System.out.println(c);
        StringBuilder builder = new StringBuilder("a");
        StringBuilder newStr = builder.append("b").append("c");

        newStr = newStr.delete(0, 1);
        newStr = newStr.replace(0, 1, "a");
        newStr = newStr.reverse();
        System.out.println(builder == newStr);
        System.out.println(newStr);
    }
}
