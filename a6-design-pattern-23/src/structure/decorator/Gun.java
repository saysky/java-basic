package structure.decorator;

import structure.decorator.inf.InfGun;


/**
 * 演示装饰者设计模式
 *
 * @author saysky
 * @alias 枪
 */
public class Gun implements InfGun {
    public void fire() {
        System.out.println("开枪");
    }

}
