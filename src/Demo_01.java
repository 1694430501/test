import java.util.UUID;

/**
 * @author: wz
 * @date: 2021/9/2 0002
 */
public class Demo_01 {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            Integer a = i;
            Integer b = i;
            System.out.println(i + "----------" + (a == b));
            System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
        }
    }
}
