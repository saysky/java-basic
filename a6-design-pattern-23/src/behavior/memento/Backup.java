package behavior.memento;

/**
 * 管理者角色：负责管理备忘录类，示例只保存了一个备忘录对象，可以通过设置栈保存多个对象
 *
 * @author liuyanzhao
 */
public class Backup {

    private ObjectInfoMemento memento;

    public ObjectInfoMemento getMemento() {
        return memento;
    }

    public void setMemento(ObjectInfoMemento memento) {
        this.memento = memento;
    }

}
