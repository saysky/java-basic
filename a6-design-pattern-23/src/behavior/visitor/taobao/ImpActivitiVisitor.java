package behavior.visitor.taobao;


public class ImpActivitiVisitor implements InfVisitor {


    public ImpActivitiVisitor() {
        super();

    }

    @Override
    public void visit(ShopCarItem shopCarItem) {
        //...是否有活动日补贴
        System.out.println("【平台活动日优惠】无活动优惠");
    }


}
