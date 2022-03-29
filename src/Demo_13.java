import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: wz
 * @date: 2021/11/17 0017
 */
public class Demo_13 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyMM");
        String date = sdf.format(new Date());
        System.out.println(date);
        System.out.println(Integer.parseInt(new SimpleDateFormat("yyMM").format(new Date()))+String.format("%05d",1));

        //String date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        //System.out.println(new Date(date1));


        //先建立一个Date对象
        Date date1=new Date();
        //设置好SimpleDateFormat的格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取当前时间，此时时间的格式为String
        String source = df.format(date1);
        //将String类型转换成Date形式
        Date dd = df.parse(source);
        System.out.println(dd);
        System.out.println(new SimpleDateFormat("yyyyMMddhhmmsssss").format(new Date()));

    }
}
