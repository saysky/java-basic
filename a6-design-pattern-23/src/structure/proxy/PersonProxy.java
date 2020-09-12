package structure.proxy;

public class PersonProxy {
    InfPersion talker;

    public PersonProxy(InfPersion talker) {
        this.talker = talker;
    }

    public void work() {
        talker.work();
    }

    public void specialWork() {

        System.out.println("代理还可以安排做特殊工作");
    }
}
