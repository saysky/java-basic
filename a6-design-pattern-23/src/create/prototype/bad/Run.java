package create.prototype.bad;

import create.prototype.bad.model.PersonalOrder;

/*
 * 1 难以扩展新的订单类型。
 * 所以：已经有了订单接口类型的对象实例，然后在方法中需要创建出更多的这种对象。
 *
 */
public class Run {
    public static void main(String[] args) {
        PersonalOrder op = new PersonalOrder();
        op.setOrderProductNum(2925);
        op.setCustomerName("张三");
        op.setProductId("P0001");
        OrderBusiness ob = new OrderBusiness();//假如现在要加入一个大客户专用订单的类型，那么就需要修改订单处理的对象
        ob.saveOrder(op);
    }
}
