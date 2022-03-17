/**
 * @author: wz
 * @date: 2021/12/10
 */
public class Demo_16 {
    public static void main(String[] args) {
        String str = "1,2,3,4,5,6,";
        String[] a = str.split(",");
        for (String s : a) {
            System.out.println(s);
        }
    }
}
