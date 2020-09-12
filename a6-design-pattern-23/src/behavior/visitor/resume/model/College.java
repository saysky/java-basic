package behavior.visitor.resume.model;

import behavior.visitor.resume.InfVisitor;

public class College extends AbstractStudent {

    @Override
    public void accept(InfVisitor visitor) {
        visitor.visit(this);
    }
}
