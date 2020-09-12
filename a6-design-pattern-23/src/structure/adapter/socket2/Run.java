package structure.adapter.socket2;

import structure.adapter.socket1.AdapterZH;
import structure.adapter.socket1.InfZhSocket;

public class Run {
    //调用的是中国适配器，但实际工作的是香港插座
    public static void main(String[] args) {
        InfZhSocket adapterZh = new AdapterZH();
        adapterZh.use();

    }

}
