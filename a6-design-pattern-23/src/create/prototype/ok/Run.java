package create.prototype.ok;

import create.prototype.ok.model.PersonalOrder;

/*
1. 原始单据不要破坏， 要生成新的单据
 */
public class Run {
    public static void main(String[] args) {
        PersonalOrder op = new PersonalOrder();
        op.setOrderProductNum(2925);
        op.setCustomerName("张三");
        op.setProductId("P0001");
        OrderBusiness ob = new OrderBusiness();
        ob.saveOrder(op);
    }
}
