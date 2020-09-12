package behavior.visitor;

import java.util.ArrayList;
import java.util.List;

import behavior.visitor.taobao.ImpActivitiVisitor;
import behavior.visitor.taobao.ImpCouponVisitor;
import behavior.visitor.taobao.ImpDiscountVisitor;
import behavior.visitor.taobao.ImpNormalVisitor;
import behavior.visitor.taobao.ShopCarItem;


public class Run {
    public static void main(String[] args) {
        List<ShopCarItem> list = new ArrayList();

        ShopCarItem item1 = new ShopCarItem();
        item1.setTitle("原装皮套");
        item1.setPrice(new Float("25"));
        item1.setNumber(2);

        ShopCarItem item2 = new ShopCarItem();
        item2.setTitle("充电宝");
        item2.setPrice(new Float("50"));
        item2.setNumber(1);

        list.add(item1);
        list.add(item2);

        for (ShopCarItem item : list) {
            item.accept(new ImpNormalVisitor()); //正常价格计算
            item.accept(new ImpActivitiVisitor());//平台活动日优惠
            item.accept(new ImpCouponVisitor()); //优惠劵
            item.accept(new ImpDiscountVisitor()); //会员折扣
        }

    }
}
