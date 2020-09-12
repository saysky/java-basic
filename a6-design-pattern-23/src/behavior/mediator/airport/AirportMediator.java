package behavior.mediator.airport;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyanzhao
 */
public class AirportMediator {
    /**
     * 本机场所有的飞机
     */
    private List array = new ArrayList();

    public void add(Fly fly) {
        array.add(fly);
    }

    public void remove(Fly fly) {
        array.remove(fly);
    }

    /**
     * 执行调度命令
     *
     * @param fly
     * @param type
     */
    public void doManager(AbstractFly fly, String type) {


        if (type.equals(AbstractFly.typeIn)) {
            if (!array.contains(fly)) {
                array.add(fly);
            }
        } else if (type.equals(AbstractFly.typeOUT)) {
            if (array.contains(fly)) {
                array.remove(fly);
            }
        }
        System.out.println("[控制中心开始沟通信息]");
        for (int i = 0; i < array.size(); i++) {
            ((Fly) array.get(i)).listerMediatorNotification("" + fly.getName()
                    + "" + type.toLowerCase() + "!");
        }

    }

}
