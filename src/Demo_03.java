import java.util.Arrays;

/**
 * @author: wz
 * @date: 2021/9/7 0007
 * 冒泡排序
 *  相邻两数比较交换位置
 */
public class Demo_03 {
    public static void main(String[] args) {
        int[] arr = {12,54,23,76,88,96,1,65,7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
