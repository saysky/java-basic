package p4streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Hello2Reduce {
    /**
     * reduce 操作可以实现从Stream中生成一个值，其生成的值不是随意的，
     * 而是根据指定的计算模型。
     * 比如，之前提到count、min和max方 法，因为常用而被纳入标准库中。
     * 事实上，这些方法都是reduce操作。
     *
     * @param args
     */
    public static void main(String[] args) {


        Boolean[] arr = {false, false};
        List<Boolean> list = Arrays.asList(arr);
        Boolean aBoolean = list.stream().reduce((one, two) -> one || true).get();
        System.out.println("最后" + aBoolean);

        /**
         * reduce后面的(one,two)为传入的两个参数,分别代表list中的第一个和第二个value,
         * 然后执行运算one||two,返回值赋给one,此时的two为list的第三个value,
         * ... ...
         * 直至遍历完list中的所有的值,最后的值为函数最终返回值,此时函数返回值为Optional类型,通过.get()获取最终的值;
         */

        // 相当于foreach遍历操作结果值
        Integer out = Stream.of(10, 5, 3, 2, 1, 0).reduce((result, item) -> {
            if (item >= 3) {
                result = result + item;
            }
            return result;
        }).get();
        System.out.println(out);

        // 相当于给定初始结果值，foreach遍历操作结果值
        Integer sum = Stream.of(10, 5, 3, 2, 1, 0).reduce(9, Hello2Reduce::sumTest);
        System.out.println(sum);

        //相当于给定初始结果值，两个foreach遍历操作结果值
        int str = Stream.of(1, 2, 3).parallel().reduce(1, (result, item) -> {
            return result + item;
        }, (result, item) -> {
            //注：只有并行parallel下才会进入此方法
            return result + item;
        });
        System.out.println(str);
    }

    /**
     * 替换Integer::sum测试
     *
     * @param a1
     * @param a2
     * @return
     */
    public static Integer sumTest(int a1, int a2) {
        return a1 + a2;
    }
}
