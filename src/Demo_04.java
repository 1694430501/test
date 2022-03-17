import java.util.Arrays;

/**
 * @author: wz
 * @date: 2021/9/8 0008
 * 选择排序
 */
public class Demo_04 {
    public static void main(String[] args) {
        int[] arr = {6, 64, 2, 5, 17, 15, 9, 0, -3, 8};
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                // 每次循环找到最小值
                if (min > arr[j]) {
                    min = arr[j];
                }
                // 用最小值跟前面的元素比较，小于或者不等于就换位置
                if (min != arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
