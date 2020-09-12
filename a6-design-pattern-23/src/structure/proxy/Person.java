package structure.proxy;

public class Person implements InfPersion {
    public String username;
    public String age;

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person(String name1, String age1) {
        this.username = name1;
        this.age = age1;
    }

    public void work() {
        System.out.println(username + "做正常的工作");
    }
}
