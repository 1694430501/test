import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: wz
 * @date: 2021/11/24 0024
 */
public class Demo_14 {
    public static void main(String[] args) {
        DateFormat df1 = new SimpleDateFormat("yyyy年MM月dd日  hh:mm:ss");
        Date d1 = new Date();
        String str = df1.format(d1);
        System.out.println(str);


        String str1 = new SimpleDateFormat("yyyy年MM月dd日  hh:mm:ss").format(new Date());
        System.out.println(str1);
    }
}
