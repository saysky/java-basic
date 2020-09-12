package behavior.memento;


/**
 * backup就是一个记账本，修改后再账本里记录一条， 想还原了，在通过账本对象还原
 * 就是个数据结构的设计而已。
 */
public class Run {

    public static void main(String[] args) {
        Backup backup = new Backup();

        ObjectInfo objectInfo = new ObjectInfo("张三", 18, 2000);
        System.out.println("第一次打印对象：" + objectInfo.getName() + "----" + objectInfo.getAge() + "---" + objectInfo.getSalary());

        // 进行备忘
        backup.setMemento(objectInfo.memento());

        objectInfo.setAge(20);
        objectInfo.setSalary(3000);
        System.out.println("第二次打印对象：" + objectInfo.getName() + "----" + objectInfo.getAge() + "---" + objectInfo.getSalary());

        //数据恢复
        objectInfo.recovery(backup.getMemento());
        System.out.println("第三次打印对象：" + objectInfo.getName() + "----" + objectInfo.getAge() + "---" + objectInfo.getSalary());

    }
}
