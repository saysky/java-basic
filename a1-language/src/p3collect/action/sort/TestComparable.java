package p3collect.action.sort;

import java.util.Iterator;
/*
 java.lang.Comparable接口中定义的compareTo()方法用于提供其实现类对象进行整体排序所需的比较逻辑。
实现类基于compareTo()方法的排序被称为自然排序。而compareTo()方法被称为它的自然比较方法，具体的排序原则可由实现类根据需要而定。
用户在重写compareTo()方法以定制比较逻辑时，需要确保其与等价性判断方法equals()保持一致。
用法举例(例11-8 )：

 * */
import java.util.TreeSet;

class Student implements java.lang.Comparable {
    private final int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
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

    public String toString() {
        return "Id: " + id + "/tName: " + name + "/tAge: " + age;
    }

    @Override
    public int compareTo(Object o) {
        Student p = (Student) o;
        return this.id - p.id;
    }

    @Override
    public boolean equals(Object o) {
        boolean flag = false;
        if (o instanceof Student) {
            if (this.id == ((Student) o).id)
                flag = true;
        }
        return false;
    }
}

public class TestComparable {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new Student(1003, "张三", 15));
        ts.add(new Student(1008, "李四", 25));
        ts.add(new Student(1015, "王五", 73));
        ts.add(new Student(1001, "赵六", 49));

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            Student employee = (Student) it.next();
            System.out.println(employee);
        }
    }
}
