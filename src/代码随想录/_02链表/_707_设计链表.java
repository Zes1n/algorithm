package 代码随想录._02链表;

/**
 * 707.设计链表
 *
 * @author wuzexin
 * @created 2022/4/14 19:31
 */
public class _707_设计链表 {

    // 链表节点结构
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    static class MyLinkedList {

        ListNode head;
        int size;

        public MyLinkedList() {
            size = 0;
            head = new ListNode(0);
        }

        // 获取链表中的第index个节点的值，如果索引无效则返回-1
        public int get(int index) {
            // 如果索引大于链表大小，则无效
            if (index + 1 > size) {
                return -1;
            }

            ListNode cur = head;
            while (index >= 0) {
                index--;
                cur = cur.next;
            }

            return cur.val;
        }

        // 在链表第一个元素之前添加元素
        public void addAtHead(int val) {

            // 如果size==0，直接添加到head下一个，
            if (size == 0) {
                head.next = new ListNode(val);
            } else {
                // 否则记录head下一个节点
                ListNode tmp = head.next;
                head.next = new ListNode(val);
                head.next.next = tmp;
            }

            size++;
        }

        // 在链表结尾添加元素
        public void addAtTail(int val) {

            ListNode cur = head;

            while (cur.next != null) {
                cur = cur.next;
            }

            cur.next = new ListNode(val);
            size++;
        }

        // 在指定位置添加元素，
        // 如果index等于链表长度，则该节点添加到链表的末尾
        // 如果index大于链表的长度，则不添加
        // 如果index小于0 则添加到头部
        public void addAtIndex(int index, int val) {

            ListNode cur = head;
            while (index > 0 && cur.next != null) {

                index --;
                cur = cur.next;
            }

            // 如果index!=0，代表index大于链表长度，不添加
            if (index != 0) {
                return;
            }

            // 判断index等于还是大于链表长度
            if (cur.next == null) {
                cur.next = new ListNode(val);
            } else {
                ListNode tmp = cur.next;
                cur.next = new ListNode(val);
                cur.next.next = tmp;
            }

            size ++;
        }

        public void deleteAtIndex(int index) {

            // 判断索引位置是否有效
            if (index + 1 > size) {
                return;
            }

            ListNode cur = head;
            while (index > 0) {
                index --;
                cur = cur.next;
            }

            if (cur.next.next != null) {
                cur.next = cur.next.next;
            } else {
                cur.next = null;
            }

            size --;
        }
    }
}
