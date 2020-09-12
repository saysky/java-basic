package behavior.visitor.resume;

import behavior.visitor.resume.model.Bachelor;
import behavior.visitor.resume.model.College;

public class ImpSumVisitor implements InfVisitor {

    private int totalBachelor;

    ImpSumVisitor() {
        super();
        totalBachelor = 0;
    }

    @Override
    public void visit(Bachelor bachelor) {
        totalBachelor++;
    }

    @Override
    public void visit(College college) {
    }

    public int getTotal_bachelor() {
        return totalBachelor;
    }
}
