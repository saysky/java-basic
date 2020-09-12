package p4streamapi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyanzhao
 */
public class Hello1 {

    public static void main(String[] args) {
        List<SomeObject> words = new ArrayList<>();
        words.add(new SomeObject("test5"));
        words.add(new SomeObject("some0"));
        words.add(new SomeObject("another3"));
        words.add(new SomeObject("test1"));
        words.add(new SomeObject("some9"));
        words.add(new SomeObject("another2"));

        /**
         * 我们使用stream API中的
         * filter函数
         * 它使用了Predicate接口，
         * 它的抽象方法返回值是boolean。filter函数根据它的返回值判断
         * 该元素是否被过滤掉。
         *
         * forEach方法
         * 表示将每个过滤后的每个元素
         * 依次执行指定操作。forEach方法使用的是Consumer接口，它的抽
         * 象方法表示在单个参数上执行的参数。
         *  语法说明
         * (SomeObject someObject) -> !someObject.getSomething().startsWith("test")
         *  参数 表达式
         */
        words.stream().filter((SomeObject someObject) -> !someObject.getSomething().startsWith("test"))
                .forEach(System.out::println);

    }

}
