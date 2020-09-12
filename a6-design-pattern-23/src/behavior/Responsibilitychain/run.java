package behavior.Responsibilitychain;

import behavior.Responsibilitychain.budgetapplication.Ceo;
import behavior.Responsibilitychain.budgetapplication.DeptManager;
import behavior.Responsibilitychain.budgetapplication.Handler;
import behavior.Responsibilitychain.budgetapplication.ProjectManager;

public class run {

    public static void main(String[] args) {
        //先要组装责任链
        Handler h1 = new Ceo();
        Handler h2 = new DeptManager();
        Handler h3 = new ProjectManager();
        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        //开始测试
        String test1 = h3.handleFeeRequest("张三", 300);
        System.out.println(test1);

        String test3 = h3.handleFeeRequest("张三", 700);
        System.out.println(test3);
        String test5 = h3.handleFeeRequest("张三", 1500);
        System.out.println(test5);

    }

} 
