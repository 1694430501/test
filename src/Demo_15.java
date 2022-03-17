import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: wz
 * @date: 2021/11/25 0025
 */
public class Demo_15 {
    public static void main(String[] args) {
        Long b = 10002L;
        String dh = new SimpleDateFormat("yyyyMM").format(new Date()) + String.format("%05d", b);
        System.out.println(dh);
        System.out.println(String.format(new SimpleDateFormat("yyyyMM").format(new Date()) + String.format("%05d", b)));
        System.out.println(new SimpleDateFormat("yyyyMMdd").format(new Date()));
    }
}
