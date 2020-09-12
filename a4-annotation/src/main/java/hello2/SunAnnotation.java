package hello2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
//Target中可以存放数组。ElementType.METHOD：表示只能标记在方法上。ElementType.TYPE：表示只能标记定义在类上、接口上、枚举上等。

public @interface SunAnnotation {
    String color() default "blue"; //表示有一个color属性，以方法的形式。设置默认属性值为蓝色

    String value();    //是一个特殊的属性，若在设置值时只有一个value属性需要设置 ，那么value可以省略，直接写所设置的值即可。

    int[] arrayArr() default {3, 4, 5, 5};//数组属性

    Class annotationClass() default B.class;

    EnumTest day() default EnumTest.MON;
}
