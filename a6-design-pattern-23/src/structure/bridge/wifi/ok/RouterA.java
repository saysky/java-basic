package structure.bridge.wifi.ok;

public class RouterA implements InfRouter {

    public InfRouter bridgeRouter;

    @Override
    public void wifi() {
        if (bridgeRouter != null) {
            bridgeRouter.wifi();
        } else {
            System.out.println("路由器A的上网宽带");
        }
    }

    public RouterA(InfRouter bridgeRouter) {
        super();
        this.bridgeRouter = bridgeRouter;
    }

    public RouterA() {
        super();
        this.bridgeRouter = null;
    }

}
