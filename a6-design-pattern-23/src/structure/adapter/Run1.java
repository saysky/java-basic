package structure.adapter;

import structure.adapter.socket1.AdapterZH;
import structure.adapter.socket1.InfZhSocket;

/**
 * 调用的是中国适配器，但实际工作的是香港插座
 * "多继承"的实现方式，带来了不良的高耦合
 */
public class Run1 {

    public static void main(String[] args) {
        InfZhSocket adapterZh = new AdapterZH();
        adapterZh.use();

    }

}
