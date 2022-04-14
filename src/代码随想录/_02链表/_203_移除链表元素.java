package 代码随想录._02链表;

/**
 * 203.移除链表元素
 *
 * @author wuzexin
 * @created 2022/4/13 10:09
 */
import java.util.*;
public class _203_移除链表元素 {

    public static ListNode removeElements (ListNode head, int val) {

        // 定义一个假头节点，防止所给链表第一个就出现val
        ListNode dummy = new ListNode(-1);

        dummy.next = head;

        ListNode cur = dummy;

        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(){}

    ListNode (int val) {
        this.val = val;
    }

    ListNode (int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
