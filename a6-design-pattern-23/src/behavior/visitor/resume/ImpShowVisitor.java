package behavior.visitor.resume;

import behavior.visitor.resume.model.AbstractStudent;
import behavior.visitor.resume.model.Bachelor;
import behavior.visitor.resume.model.College;

public class ImpShowVisitor implements InfVisitor {

    @Override
    public void visit(Bachelor bachelor) {
        System.out.println("硕士简历：");
        //TODO 可能会有一些特异的操作，我们为了简单就省略了
        this.printMessage(bachelor);
    }

    @Override
    public void visit(College college) {
        System.out.println("本科生简历：");
        //TODO 同上
        this.printMessage(college);
    }

    public void printMessage(AbstractStudent student) {
        System.out.println("姓名 : " + student.getName() + "/n"
                + "大学 : " + student.getUniversity() + "/n"
                + "分数 : " + student.getRating() + "/n"
        );
    }
}
