package com.DataStructures.List.LinkedList;

/**
 * @author littledream1502@gmail.com
 * @date 2017/11/26
 * @desc
 */
public class SinglyLinkedList {

    /**
     * 头结点;
     */
    static NodeForSinglyLinkedList head;

    /**
     * 左增节点，将新增的节点标记为头结点;
     *
     * @param data
     * @desc add a new node at the front the linkedlist;
     * @complexity:O(1)
     */
    public void lpush(int data) {
        NodeForSinglyLinkedList node = new NodeForSinglyLinkedList(data);
        node.next = head;
        head = node;
    }

    /**
     * 右增节点,原来头结点依旧为头结点;
     *
     * @param data
     * @desc add a new node at the end of linkedlist;
     * @complexity: O(n)
     */
    public void rpush(int data) {
        /**
         * 构建新节点;
         */
        NodeForSinglyLinkedList node = new NodeForSinglyLinkedList(data);
        while (head == null) {
            head = node;
            return;
        }
        //构建活动节点,每次轮询至链表尾部添加新节点;
        NodeForSinglyLinkedList last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        return;
    }

    /**
     * @desc 链表右端取出一个节点, 并删除;
     */
    public static void rpop() {
        NodeForSinglyLinkedList now = head;
        int length = getNodeCount();
        for (int i = 0; i < length - 2; i++) {
            now = now.next;
        }
        now.next = null;
    }

    /**
     * @desc 链表左端取出一个节点, 并删除;
     */
    public static void lpop() {
        head = head.next;
    }

    /**
     * 删除指定位置上的节点元素;
     *
     * @param index
     * @example 1->2->3->4
     * index=2
     * ---------
     * 1->3->4
     */
    public static void deleteByIndex(int index) {
        if (index < 0 || index > getNodeCount()) {
            return;
        }
        NodeForSinglyLinkedList now = head;
        if (index == 1) {
            head = head.next;
            return;
        }
        for (int i = 0; i < index - 2; i++) {
            now = now.next;
        }
        if (now == null || now.next == null) {
            return;
        }
        NodeForSinglyLinkedList last = now.next.next;
        now.next = last;
    }

    /**
     * 在特定位置index后插入一个节点;
     *
     * @param index
     * @param data
     * @complexity O(n)
     */
    public static void insertAfterIndex(int index, int data) {

        if (index <= 0 || head == null) {
            return;
        }

        //0->1->2->4
        NodeForSinglyLinkedList node = new NodeForSinglyLinkedList(data);
        NodeForSinglyLinkedList now = head;
        //找到特定位置的那个节点
        for (int i = 0; now != null && i < index - 1; i++) {
            now = now.next;
        }
        node.next = now.next;
        now.next = node;
        return;
    }

    /**
     * @desc 按链表顺序打印链表元素;
     */
    public static void printList() {
        NodeForSinglyLinkedList node = head;
        while (node != null) {
            System.out.println(node.val + " ");
            node = node.next;
        }
    }

    /**
     * @desc 反向打印链表元素;
     */
    public static void reversePrintList() {

    }

    /**
     * 获取链表节点数量
     *
     * @return
     */
    public static int getNodeCount() {
        NodeForSinglyLinkedList tmp = head;
        int count = 0;
        while (tmp != null) {
            count += 1;
            tmp = tmp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.rpush(1);
        list.rpush(2);
        list.rpush(3);
        list.rpush(4);
        deleteByIndex(2);
        printList();
        System.out.println(list.getNodeCount());
    }
}
