package p3collect.container.set;

/**
 * 链表的演示
 *
 * @author liuyanzhao
 */
public class LinkedDemo {
    public static void main(String[] args) {
        Linked linked = new Linked();
        linked.head = new Node("黑桃J");
        linked.head.next = new Node("黑桃Q");
        linked.head.next.next = new Node("黑桃K");
        linked.head.next.next.next = new Node("黑桃A");
        System.out.println(linked);
    }
}

/**
 * 链表
 */
class Linked {

    /**
     * 链表是头节点
     */
    Node head;

    @Override
    public String toString() {
        return head.toString();
    }
}

/**
 * 链表节点
 */
class Node {
    /**
     * 链表节点上的数据
     */
    Object obj;

    /**
     * 下一个节点
     */
    Node next;

    public Node(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return next == null ? obj.toString() :
                obj.toString() + "," + next;
    }
}






