/**
 * @author: wz
 * @date: 2022/03/31
 * return跟finally返回
 */
public class Demo_22 {
    public static void main(String[] args) {
        System.out.println(print());
    }
    public static int print(){
        try{
            return 2;
        }finally {
            return 3;
        }
    }
}
