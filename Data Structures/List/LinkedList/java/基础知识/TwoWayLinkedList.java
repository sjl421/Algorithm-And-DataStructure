/**
 * @author littledream1502@gmail.com
 * @date 2017/11/26
 * @desc 双向链表类
 */
public class TwoWayLinkedList {

    //定义头结点
    static NodeForTwoWayLinkedList head = null;

    /**
     * 左增节点，将新增的节点标记为头结点;
     * add a new node at the front of the linkedlist;
     *
     * @param data
     */
    public static void lpush(int data) {

        NodeForTwoWayLinkedList node = new NodeForTwoWayLinkedList(data);
        /**
         * 将新增节点指向头结点;
         */
        node.next = head;
        if (head != null) {
            head.pre = node;
        }
        /**
         * 将head平移指向新头结点;
         */
        head = node;
    }

    /**
     * 右增节点,在链表末尾添加节点;
     * add a new node at the end of linkedlist;
     *
     * @param data
     */
    public static void rpush(int data) {
        NodeForTwoWayLinkedList node = new NodeForTwoWayLinkedList(data);
        if (head == null) {
            head = node;
            return;
        }
        NodeForTwoWayLinkedList last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.pre = last;

    }

    public static void main(String[] args) {
        head = new NodeForTwoWayLinkedList(1);
        head.next = new NodeForTwoWayLinkedList(2);
        rpush(3);
        System.out.println(head.toString());
    }
}
