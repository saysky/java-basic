package structure.bridge.wifi.ok;

public class RouterB implements InfRouter {
    public InfRouter bridgeRouter;

    @Override
    public void wifi() {
        if (bridgeRouter != null) {
            bridgeRouter.wifi();
        } else {
            System.out.println("路由器B的上网宽带");
        }
    }

    public RouterB(InfRouter bridgeRouter) {
        super();
        this.bridgeRouter = bridgeRouter;
    }

    public RouterB() {
        super();
        this.bridgeRouter = null;
    }
}
