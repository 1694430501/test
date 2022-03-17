/**
 * @author: wz
 * @date: 2021/9/17 0017
 */
public class Demo_09 {
    public static void main(String[] args) {
        int a = 400, i = 0;
        int sum = 0;
        while (i < 10) {
            a += a * 0.05;//
            int b = a;
            if (i <= 4) {
                sum += a;
            }
            i++;
        }
        System.out.println(sum);
        System.out.println(a);
    }
}
