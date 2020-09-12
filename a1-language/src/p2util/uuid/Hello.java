package p2util.uuid;

import java.util.UUID;

/**
 * 通用唯一识别码（英语：Universally Unique Identifier，简称UUID）
 * 是一种软件建构的标准，亦为自由软件基金会组织在分散式计算环境领域的一部份。
 * UUID的目的，是让分散式系统中的所有元素，都能有唯一的辨识信息，而不需要通
 * 过中央控制端来做辨识信息的指定。如此一来，每个人都可以创建不与其它人冲突的UUID。
 * 一组UUID，是由一串16位组（亦称128位）的16进位数字所构成，
 * 是故UUID理论上的总数为216 x 8=2128，约等于3.4 x 1038。也就是说若每纳秒产生1兆
 * 个UUID，要花100亿年才会将所有UUID用完。所以无需考虑它的重复性。
 * UUID的标准型式包含32个16进位数字，以连字号分为五段，形式为8-4-4-4-12的32个字符，加上"-"一共是36位，所以咱们可以先取出uuid，再把"-"去掉。
 * <p>
 * <p>
 * GUID是一个128位长的数字，一般用16进制表示。算法的核心思想是结合机器的网卡、当地时间、一个随即数来生成GUID。从理论上讲，如果一台机器每秒产生10000000个GUID，则可以保证（概率意义上）3240年不重复。
 * UUID是1.5中新增的一个类，在java.util下，用它可以产生一个号称全球唯一的ID
 * <p>
 * System.out.println("GUID :"+UUID.randomUUID().toString().trim().replace("-", ""));
 * // 生成了32位长度的字符串 GUID :00c20a09d3074824b668ea4300a54df4
 * 可以用来拼接作为路径，或者图片的前缀名
 *
 * @author liuyanzhao
 */
public class Hello {

    public static void main(String[] args) {
        /**
         * 获取UUID并转化为String对象
         */
        String uuid = UUID.randomUUID().toString();

        /**
         * 因为UUID本身为32位只是生成时多了"-"，所以将它们去点就可
         */
        uuid = uuid.replace("-", "");
        System.out.println(uuid);
    }
}
