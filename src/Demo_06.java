import java.util.Arrays;

/**
 * @author: wz
 * @date: 2021/9/9 0009
 * 插入排序
 */
public class Demo_06 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 0, 9, 8, 2, 3, 1, 7, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
