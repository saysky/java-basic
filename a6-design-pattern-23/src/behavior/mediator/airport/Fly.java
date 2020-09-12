package behavior.mediator.airport;

public class Fly extends AbstractFly {

    public Fly(String name) {
        super(name);
    }

    @Override
    public void doSelfMethod(String type) {
        System.out.println(super.name + "----" + type.toLowerCase());
    }

    @Override
    public void doDepMethod(String type) {
        System.out.println(super.name + "----向控制中心通知");
        super.airportMediator.doManager(this, type);

    }

    @Override
    public void in() {
        doSelfMethod(typeIn);
        doDepMethod(typeIn);
    }

    @Override
    public void out() {
        doSelfMethod(typeOUT);
        doDepMethod(typeOUT);
    }


    @Override
    public void listerMediatorNotification(String notification) {
        System.out.println(super.name + "----接收控制中心通知：" + notification);
    }

}
