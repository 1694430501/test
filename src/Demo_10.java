import java.util.UUID;

/**
 * @author: wz
 * @date: 2021/9/20 0020
 */
public class Demo_10 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(String.format("%02d", a += 1));
            System.out.println(String.format("%04d", a += 1).replace(" ", "0"));
        }
        System.out.println(String.format("%06d", 30));
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        System.out.println(uuid);
        //System.out.println(String.format("%05d", "30"));
    }
}
