import java.util.Arrays;

/**
 * @author: wz
 * @date: 2021/9/8 0008
 * 希尔排序
 */
public class Demo_05 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 0, 9, 8, 2, 3, 1, 7, 4};
        //增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j--) {
                    if(arr[j] > arr[j + gap]) {
                        int temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
