package behavior.visitor.taobao;


public class ImpDiscountVisitor implements InfVisitor {


    public ImpDiscountVisitor() {
        super();

    }

    @Override
    public void visit(ShopCarItem shopCarItem) {
        //...获取会员在该店的会员身份

        System.out.print("【会员打折】" + shopCarItem.sum + "X 8折（黄金会员）=");
        shopCarItem.sum = shopCarItem.sum * 8 / 10;
        System.out.println(shopCarItem.sum);
    }


}
