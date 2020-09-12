package behavior.visitor.resume;

import behavior.visitor.resume.model.Bachelor;
import behavior.visitor.resume.model.College;

public interface InfVisitor {
    public void visit(Bachelor bachelor);

    public void visit(College college);
}
