import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: wz
 * @date: 2021/11/17 0017
 */
public class Demo_12 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        String date = sdf.format(new Date());
        System.out.println(date);
        String a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(a);
        System.out.println(new Date());
    }
}
