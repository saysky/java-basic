package p3collect.action.sort;

import java.util.Arrays;
import java.util.List;

public class TestArrays {
    public static void main(String[] args) {
        Integer[] a = {3, 25, 12, 79, 48};

        System.out.println("原始：" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序后：" + Arrays.toString(a));

        int idx = Arrays.binarySearch(a, 25);
        System.out.println(idx);


        List list = Arrays.asList(3, 4, 5);
        System.out.println(list);

    }
}
