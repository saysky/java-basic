package behavior.visitor.taobao;


public class ImpNormalVisitor implements InfVisitor {


    public ImpNormalVisitor() {
        super();

    }

    @Override
    public void visit(ShopCarItem shopCarItem) {
        shopCarItem.sum = shopCarItem.price * shopCarItem.number;
        System.out.println("/n【正常价格】" + shopCarItem.getShopInfo() + shopCarItem.sum + "/n----------------------------------------------");
    }


}
