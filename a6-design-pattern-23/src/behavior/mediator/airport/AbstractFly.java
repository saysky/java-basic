package behavior.mediator.airport;

public abstract class AbstractFly {
    /**
     * 定义飞机是进站还是出站
     */
    public static String typeIn = "进机场";
    public static String typeOUT = "起飞离开机场";

    protected String name;


    /**
     * 定义中介者飞机场调度中心
     */
    protected AirportMediator airportMediator;

    public AbstractFly(String name) {
        super();
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public AirportMediator getAirportMediator() {
        return airportMediator;
    }

    public void setAirportMediator(AirportMediator airportMediator) {
        this.airportMediator = airportMediator;
    }

    /**
     * 定义飞机执行自己的操作
     *
     * @param type
     */
    public abstract void doSelfMethod(String type);

    /**
     * 定义飞机执行与机场调度中心的操作
     *
     * @param type
     */
    public abstract void doDepMethod(String type);

    /**
     * 定义飞机进站操作
     */
    public abstract void in();

    /**
     * 定义飞机出站操作
     */
    public abstract void out();

    /**
     * 定义飞机监听机场调度中心的通知
     *
     * @param notification
     */
    public abstract void listerMediatorNotification(String notification);

}
