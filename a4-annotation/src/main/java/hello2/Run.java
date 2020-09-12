package hello2;

/**
 * 说明：
 * 可以再注解中塞 字符串，类， 数组，某人有value字符串 ，
 * 还可以自己定义方法返回数据值
 */

//@SunAnnotation(annotationClass=B.class,color="red",value="abc",arrayArr={1,3,9})	
@SunAnnotation(value = "123", day = EnumTest.SUN)
public class Run {
    public static void main(String[] args) throws Exception {
        if (Run.class.isAnnotationPresent(SunAnnotation.class)) {
            SunAnnotation annotation = (SunAnnotation) Run.class.getAnnotation(SunAnnotation.class);
            System.out.println(annotation.value());
            System.out.println(annotation.color());//调用color属性方法
            System.out.println(annotation.arrayArr().length);//这里输出的是数组长度，不能直接输出数组的每一个值
            System.out.println(annotation.annotationClass());//注解类
            System.out.println(annotation.day());//枚举星
        }
    }

} 
