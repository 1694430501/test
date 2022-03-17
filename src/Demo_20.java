import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: wz
 * @date: 2021/12/20
 */
public class Demo_20 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        list.add("a");
        list.add("d");
        list.add("d");
        list.add("b");
        set.addAll(list);
        for (String a : set) {
            System.out.println(a);
        }
    }
}
