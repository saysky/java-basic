package behavior.visitor.taobao;


public class ImpCouponVisitor implements InfVisitor {


    public ImpCouponVisitor() {
        super();

    }

    @Override
    public void visit(ShopCarItem shopCarItem) {
        //....获取商品优惠劵
        System.out.print("【优惠劵】" + shopCarItem.sum + "-10元（优惠劵）=");
        shopCarItem.sum = shopCarItem.sum - 10;
        System.out.println(shopCarItem.sum);
    }


}
