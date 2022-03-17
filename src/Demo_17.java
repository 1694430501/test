import java.util.UUID;

/**
 * @author: wz
 * @date: 2021/12/14
 */
public class Demo_17 {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        String str = "4,5，6.7";
        String[] a = str.split(",|，");
        for (String b : a) {
            System.out.println(b);
        }
        System.out.println(uuid);
        if ("1234".contains("4")) {
            System.out.println("包含");
        }
        String q = "asdf";
        String w = "asdfs";
        System.out.println(q + w);
    }
}
