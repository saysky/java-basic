package behavior.observer.weixin;

/**
 * @author liuyanzhao
 */
public class WeixinUser implements Observer {
    /**
     * 微信用户名
     */
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " ----看到---" + message);
    }


}
