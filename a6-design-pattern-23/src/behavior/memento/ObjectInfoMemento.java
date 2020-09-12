package behavior.memento;

/**
 * @author liuyanzhao
 */
public class ObjectInfoMemento {
    private String name;
    private int age;
    private int salary;

    public ObjectInfoMemento(ObjectInfo emp) {
        this.name = emp.getName();
        this.age = emp.getAge();
        this.salary = emp.getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
