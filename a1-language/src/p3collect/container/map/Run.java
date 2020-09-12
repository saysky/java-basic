package p3collect.container.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Person implements java.lang.Comparable {
    private final int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Id: " + id + "/tName: " + name + "/tAge: " + age;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return this.id - p.id;
    }

    @Override
    public boolean equals(Object o) {
        boolean flag = false;
        if (o instanceof Person) {
            if (this.id == ((Person) o).id) {
                flag = true;
            }
        }
        return false;
    }
}

public class Run {
    public static void main(String[] args) {
        Map<Integer, Person> hm = new HashMap();
        hm.put(new Integer(1003), new Person(1003, "张三", 15));
        hm.put(new Integer(1008), new Person(1008, "李四", 25));

        /**
         * 自动封装
         */
        hm.put(1015, new Person(1015, "王五", 73));
        hm.put(1001, new Person(1001, "赵六", 49));

        System.out.println("----检索单个元素----");
        Person p = hm.get(1008);
        System.out.println(p);

        System.out.println("----遍历所有键（元素名）----");
        Set names = hm.keySet();
        for (Object o : names) {
            System.out.println(o);
        }

        System.out.println("----遍历所有值（元素值）----");
        Collection values = hm.values();
        for (Object o : values) {
            System.out.println(o);
        }
    }
}
