package p4lambda;

import java.util.Arrays;

/**
 * 1.函数式编程引入了Java。
 * Lambda允许把函数作为一个方法的参数，或者把代码看成数据。
 * 本质是函数。
 * Streams API 与传统collectapi对比Streams API不修改数据
 * 对 Stream 对象操作能得到一个结果，但是不会修改原始数据。
 * <p>
 * 表达式
 * // 1. 不需要参数,返回值为 5
 * () -> 5
 * <p>
 * // 2. 接收一个参数(数字类型),返回其2倍的值
 * x -> 2 * x
 * <p>
 * // 3. 接受2个参数(数字),并返回他们的差值
 * (x, y) -> x - y
 * <p>
 * // 4. 接收2个int型整数,返回他们的和
 * (int x, int y) -> x + y
 * <p>
 * // 5. 接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void)
 * (String s) -> System.out.print(s)
 *
 * @author liuyanzhao
 */
public class Hello2 {

    public static void main(String[] args) {

        Arrays.asList("p", "k", "u", "f", "o", "r", "k").forEach(e -> System.out.println(e));
    }

}
