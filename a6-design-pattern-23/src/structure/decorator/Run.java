package structure.decorator;

import structure.decorator.inf.InfGun;
import structure.decorator.inf.decorator.Knife;


/**
 * 演示装饰者设计模�?
 *
 * @author saysky
 */
public class Run {
    public static void main(String[] args) {
        InfGun gun = new Knife(new Gun());
        gun.fire();
    }

}
