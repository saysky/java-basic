package behavior.Responsibilitychain.budgetapplication;

/**
 * @author liuyanzhao
 */
public class ProjectManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if (fee < 500) {
            str = "项目经理:同意【" + user + "】的聚餐费用，金额为" + fee + "元";
        } else {
            // 超过500，继续传递给级别更高的人处理
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }
        return str;
    }

}
