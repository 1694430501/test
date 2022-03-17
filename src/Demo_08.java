/**
 * @author: wz
 * @date: 2021/9/17 0017
 */
public class Demo_08 {
    public static void main(String[] args) {
        for (int a = 0; a <= 8; a++) {
            for (int b = 0; b <= 8; b++) {
                if ((a * 20 + b * 12 == 112) && (a + b == 8)) {
                    System.out.println(a);
                    System.out.println(b);
                }
            }
        }
    }
}
