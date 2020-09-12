package h2data;

/**
 * byte的取值范围为-128~127，占用1个字节（-2的7次方到2的7次方-1）
 * <p>
 * short的取值范围为-32768~32767，占用2个字节（-2的15次方到2的15次方-1）
 * <p>
 * int的取值范围为（-2147483648~2147483647），占用4个字节（-2的31次方到2的31次方-1）
 * <p>
 * long的取值范围为（-9223372036854774808~9223372036854774807），占用8个字节（-2的63次方到2的63次方-1）
 * <p>
 * Float 32位单精度浮点数 根据IEEE754-1985标准
 * <p>
 * Double 64位双精度浮点数 根据IEEE754-1985标准　一些提示：
 */

public class Range {

    public static void main(String[] args) {
        short s1 = 32767;
        // short s2=32768;

        int i1 = 2147483647;
        // int i2=2147483648;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        // long l2=new Long(9223372036854775807);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        long l1 = 999999999;

        long minValue = 0x8000000000000000l; //大于证书范围，就要用16进制进行复制
        long maxValue = 0x7fffffffffffffffl;

        System.out.println(minValue);
        System.out.println(maxValue);


        System.out.println(Float.MAX_VALUE); //2的128次方-1, 38个数位，比long多了一倍,这个主要用来做简单数学精确运算使用
        System.out.println(Float.MIN_VALUE); //2的-149次方


        System.out.println(Double.MAX_VALUE); //2的1024次方-1,308个数位，是float数位的10倍，主要用来做复杂运算和天文运算
        System.out.println(Double.MIN_VALUE); //2的-1074次方1.7976931348623157E308	4.9E-324


    }

}
