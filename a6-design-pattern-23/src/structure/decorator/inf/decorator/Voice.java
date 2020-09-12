package structure.decorator.inf.decorator;
/**
 * 演示装饰者设计模式
 *
 * @author saysky
 */

import java.util.ArrayList;
import java.util.ListIterator;

import structure.decorator.inf.InfGun;

/**
 * @alias 瞄准器（装饰者）
 */

public class Voice implements InfGun {
    private InfGun gun;//额外增加的功能被打包在这个List中
    private ArrayList infList = new ArrayList(); //在构造器中使用组合new方式,引入Work对象;

    public Voice(InfGun infGun) {
        this.gun = infGun;
        infList.add("使用消音器"); //让枪装上瞄准器

    }

    //先使用
    public void fire() {
        //在开枪之前使用 了 枪接口上的无间
        ListIterator listIterator = infList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(((String) (listIterator.next())));
        }
        gun.fire();
    }


}
