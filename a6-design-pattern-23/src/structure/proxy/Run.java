package structure.proxy;

public class Run {

    public static void main(String[] args) {


        InfPersion person = new Person("李莉", "22岁");
        person.work(); //李莉只能做正常工作

        PersonProxy proxy = new PersonProxy(person);
        proxy.specialWork(); //如果要让李莉做特殊工作，需要让代理安排
    }


}
