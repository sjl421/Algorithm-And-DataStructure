package com.DataStructures.List.LinkedList;

/**
 * @author littledream1502@gmail.com
 * @date 2017/11/26
 * @desc 单向链表;
 */
public class SinglyLinkedList {

    /**
     * 头结点;
     */
    static NodeForSinglyLinkedList head = null;

    /**
     * 左增节点，将新增的节点标记为头结点;
     *
     * @param data
     * @desc add a new node at the front the linkedlist;
     * @complexity:O(1)
     */
    public static void lpush(int data) {
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
    public static void rpush(int data) {
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
     * @after wait to gc the pre node been deleted;
     */
    public static void lpop() {
        head = head.next;
    }

    /**
     * 根据下标获取节点值;
     *
     * @param index
     * @return
     * @desc 下标从1开始
     */
    public static int getValueFromIndex(int index) {
        if (index < 1) {
            return getValueFromIndex(1);
        }
        if (index > getNodeCount()) {
            return getValueFromIndex(getNodeCount());
        }
        NodeForSinglyLinkedList current = head;
        int count = 1;
        for (int i = 1; i < index + 1; i++) {
            if (count == index) {
                return current.val;
            } else {
                count += 1;
                current = current.next;
            }
        }
        return 0;
    }

    /**
     * 删除指定位置上的节点元素;
     *
     * @param index
     * @example 1->2->3->4
     * @desc 下标从1开始;
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

        if (index < 1 || head == null || index > getNodeCount()) {
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
    public static void printList(NodeForSinglyLinkedList head) {
        NodeForSinglyLinkedList node = head;
        while (node != null) {
            System.out.println(node.val + " ");
            node = node.next;
        }
    }

    /**
     * @desc 将链表翻转;
     * @main 改变指向;
     * @understanding 我们把node.next理解为节点前后关系的改变;
     * 而node[1]=node[2] 理解为node节点位置的改变;
     *
     *
     * -----------------------------------------[I]
               1----->3----->2----->4
               ^      ^
            current  next
      -------------------------------------------[II]
     null<-----1      3----->2----->4
      ^        ^      ^
     pre    current  next
    -----------------------------------------[III]
    null<-----1      3----->2----->4
              ^      ^
             pre  current
                     ^
                    next
    -----------------------------------------[IV]
    null<-----1      3----->2----->4
              ^      ^      ^
             pre  current  next
    -----------------------------------------[IV]
    null<-----1<-----3      2----->4
              ^      ^      ^
             pre  current  next     
    -----------------------------------------[V]
    null<-----1<-----3      2----->4
              ^      ^      ^
             pre  current  next    
    -----------------------------------------[VI]
    null<-----1<-----3      2----->4
                     ^      ^      ^
                    pre  current
                            ^  
                           next
    -----------------------------------------[VII]
    null<-----1<-----3      2----->4
                     ^      ^      ^
                    pre  current  next
                            
                       
     */
    public static NodeForSinglyLinkedList reverseLinkedList(NodeForSinglyLinkedList head) {
        NodeForSinglyLinkedList pre = null;
        NodeForSinglyLinkedList current = head;
        NodeForSinglyLinkedList next = null;
        while (current != null) {

            /**
             *  保证链表后续元素不丢失;
             *  如过程[I]所示;
             */
            next = current.next;
            /**
             * 逐一改变链表之间指向关系;
             *  如过程[II]所示;
             */
            current.next = pre;
            /**
             * 如过程[III]所示;
             */
            pre = current;
            /**
             * 如过程[III]所示;
             */
            current = next;
            /**
             * 过程[IV] 则表示上述过程轮询;
             */
        }
        head = pre;
        return head;
    }
    
     /**
     * 判断一个链表是否存在环;
     *
     * @param head
     * @return
     * @desc 定义2个指针以不同速度轮询链表, 如果出现了指针相遇的情况, 说明存在环;
     */
    public static boolean detectLoop(NodeForSinglyLinkedList head) {

        NodeForSinglyLinkedList first = head, slow = head;

        while (first != null && first.next != null) {
            first = first.next.next;
            slow = slow.next;
            if (first == slow) return true;
        }
        return false;
    }

     /**
     * 若一个链表有环,计算环的长度;
     * 知识链接: https://www.cnblogs.com/fankongkong/p/7007869.html
     * @param head
     * @return
     * @desc --------------------------------------------------------------------------------
     */
    public static int getLoopLength(NodeForSinglyLinkedList head) {
        int count = 0;
        NodeForSinglyLinkedList first = head, slow = head;
        while (first != null && first.next != null) {
            first = first.next.next;
            slow = slow.next;
            count += 1;
            if (first == slow) {
                return count;
            }
        }
        return count;
    }


    /**
     * 根据节点位置交换位置
     * 1->5->3->2
     * ---------
     * 第二个和第四个换位置
     * ---------
     * 1->2->3->5
     *
     * @param x
     * @param y
     */
    public static void swapNodesFromIndex(int x, int y) {

        if (x == y) {
            return;
        } else if (x < 1 || y > getNodeCount()) {
            return;
        }
        if (x == 1) {
            int val = head.val;
            deleteByIndex(1);
            lpush(getValueFromIndex(y - 1));
            deleteByIndex(y);
            insertAfterIndex(y - 1, val);
        } else {
            int val = getValueFromIndex(x);
            deleteByIndex(x);
            insertAfterIndex(x - 1, getValueFromIndex(y - 1));
            deleteByIndex(y);
            insertAfterIndex(y - 1, val);
        }
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

    /**
     * @param args
     */
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.rpush(1);
        list.rpush(2);
        list.rpush(3);
        list.rpush(4);
        list.rpush(5);
        list.rpush(6);
        list.rpush(7);
        list.rpush(8);
        /* deleteByIndex(1);
        insertAfterIndex(1, 3);
        deleteByIndex(3);
        insertAfterIndex(2, 1);*/
        //swapNodesFromIndex(2, 3);
        printList(reverseLinkedList(head));
        System.out.println("链表个数为:" + list.getNodeCount());
    }
}
