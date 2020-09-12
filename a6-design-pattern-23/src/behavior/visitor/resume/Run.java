package behavior.visitor.resume;

import java.util.ArrayList;
import java.util.List;

import behavior.visitor.resume.model.AbstractStudent;
import behavior.visitor.resume.model.Bachelor;
import behavior.visitor.resume.model.College;


public class Run {
    public static void main(String[] args) {
        List<AbstractStudent> list = new ArrayList();

        Bachelor bachelor = new Bachelor();
        bachelor.setName("张三");
        bachelor.setRating("100");
        bachelor.setUniversity("北京理工");

        Bachelor bachelor2 = new Bachelor();
        bachelor2.setName("李四");
        bachelor2.setRating("100");
        bachelor2.setUniversity("清华大学");

        College college = new College();
        college.setName("王二");

        college.setRating("1");
        college.setUniversity("中山大学");


        list.add(bachelor);
        list.add(bachelor2);
        list.add(college);


        InfVisitor visitorShow = new ImpShowVisitor();
        InfVisitor visitorSum = new ImpSumVisitor();
        for (AbstractStudent student : list) {
            student.accept(visitorShow);
            student.accept(visitorSum);
        }


        System.out.println("bachelors 简历的总数是: " + ((ImpSumVisitor) visitorSum).getTotal_bachelor());
    }
}
