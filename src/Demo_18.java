import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: wz
 * @date: 2021/12/20
 */
public class Demo_18 {
    public static void main(String[] args) {
        /*String a = "121KCZ0105C";
        //Pattern reg =Pattern.compile("^[0-9]*$");
        Pattern reg = Pattern.compile("^[A-Z0-9]+$");
        Matcher mat = reg.matcher(a);
        boolean a1 = mat.find();
        if (a1) {
            System.out.println("数字");
        } else {
            System.out.println("不是数字");
        }*/


        Pattern p = Pattern.compile("^(100|([1-9][0-9]?)|(0|[1-9][0-9]?)(?:\\.\\d{0,1}))?$");
        System.out.println("0  " + p.matcher("0").matches());
        System.out.println("1  " + p.matcher("1").matches());
        System.out.println("1.1  " + p.matcher("1.1").matches());
        System.out.println("1.11  " + p.matcher("1.11").matches());
        System.out.println("10  " + p.matcher("10").matches());
        System.out.println("90.2  " + p.matcher("10").matches());


    }
}
