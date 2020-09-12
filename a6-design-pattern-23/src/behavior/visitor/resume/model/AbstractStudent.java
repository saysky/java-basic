package behavior.visitor.resume.model;

import behavior.visitor.resume.InfVisitor;

public abstract class AbstractStudent {
    //提供对于数据域基本操作的函数
    private String name;
    private String university;
    private String rating;

    //让指定的visitor获得操作该对象的权限
    public abstract void accept(InfVisitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
