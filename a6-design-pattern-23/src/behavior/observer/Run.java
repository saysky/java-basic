package behavior.observer;

import behavior.observer.weixin.SubscriptionSubject;
import behavior.observer.weixin.WeixinUser;

/**
 * @author liuyanzhao
 */
public class Run {

    public static void main(String[] args) {
        SubscriptionSubject mSubscriptionSubject = new SubscriptionSubject();

        /**
         * 订阅公众号
         */
        mSubscriptionSubject.attach(new WeixinUser("张三"));
        mSubscriptionSubject.attach(new WeixinUser("李四"));
        mSubscriptionSubject.attach(new WeixinUser("王五"));

        //公众号更新发出消息给订阅的微信用户
        mSubscriptionSubject.notify("全世界第一针新冠疫苗打在武汉");
    }
}
