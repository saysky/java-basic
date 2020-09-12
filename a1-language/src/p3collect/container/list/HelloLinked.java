package p3collect.container.list;


/**
 * 链表的演示
 */
public class HelloLinked {
    public static void main(String[] args) {
        Linked linked = new Linked();
        linked.head = new Node("黑桃J");
        linked.head.next = new Node("黑桃Q");
        linked.head.next.next = new Node("黑桃K");
        linked.head.next.next.next = new Node("黑桃A");
        System.out.println(linked);
    }
}

class Linked { //链表
    Node head; // 链表是头节点

    public String toString() {
        return head.toString();
    }
}

//链表节点
class Node {
    Object obj;//链表节点上的数据
    Node next;//下一个节点

    public Node(Object obj) {
        this.obj = obj;
    }

    public String toString() {
        return next == null ? obj.toString() :
                obj.toString() + "," + next;
    }
}








