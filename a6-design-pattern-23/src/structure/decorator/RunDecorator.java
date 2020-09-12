package structure.decorator;

import structure.decorator.inf.InfGun;
import structure.decorator.inf.decorator.Eye;
import structure.decorator.inf.decorator.Voice;


/**
 * 演示装饰者设计模式
 *
 * @author saysky
 */
public class RunDecorator {
    public static void main(String[] args) {
        InfGun gun = new Eye(new Voice(new Gun()));
        gun.fire();
    }

}
