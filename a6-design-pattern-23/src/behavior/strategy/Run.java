package behavior.strategy;

import behavior.strategy.travel.ImpTrainStrategy;
import behavior.strategy.travel.InfTravelStrategy;

/**
 * 与 工厂模式的区别：，它关注对象创建，提供创建对象的接口. 让对象的创建与具体的使用客户无关。
 * 策略模式是对象行为型模式 ，它关注行为和算法的封装
 */
public class Run {
    public InfTravelStrategy travelStrategy;

    Run(InfTravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public static void main(String[] args) {
        Run runTravel = new Run(new ImpTrainStrategy());
        runTravel.travelStrategy.travelAlgorithm();
    }

}
