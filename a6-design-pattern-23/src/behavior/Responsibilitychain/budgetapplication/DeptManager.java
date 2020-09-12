package behavior.Responsibilitychain.budgetapplication;

public class DeptManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {

        String str = "";
        // 部门经理的权限只能在1000以内
        if (fee < 1000) {
            str = "部门经理：审批了【" + user + "】的聚餐费用，金额为" + fee + "元";

        } else {
            // 超过1000，继续传递给级别更高的人处理
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }
        return str;
    }

}
