package structure.adapter;

import structure.adapter.socket2.AdapterI18n;
import structure.adapter.socket2.SocketHk;
import structure.adapter.socket2.SocketJp;

/**
 * 可以同时使用多个国家插座
 * <p>
 * 对象适配器采用"对象组合"的方式，更符合松耦合精神。
 *
 * @author lingli
 */
public class Run2 {

    public static void main(String[] args) {
        AdapterI18n adapterI18n = new AdapterI18n(new SocketJp());
        adapterI18n.use();

        adapterI18n = new AdapterI18n(new SocketHk());
        adapterI18n.use();

    }

}
