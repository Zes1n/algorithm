package 代码随想录._02链表;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 206.反转链表
 *
 * @author wuzexin
 * @created 2022/4/15 10:37
 */
public class _206_反转链表 {

    // 链表节点结构
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {};

        ListNode (int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // 反转链表
    public static ListNode reverseListNode(ListNode head) {

        ListNode pre = null;
        ListNode cur = null;

        while (head != null) {
            cur = head.next;
            head.next = pre;
            pre = head;
            head = cur;
        }

        return pre;
    }

    // 打印链表
    public static void printList(ListNode head) {

        System.out.print("[");

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(",");
            }

            head = head.next;
        }

        System.out.println("]");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.length() <= 3) {
            System.out.println(s);
            return;
        }

        String[] split = s.substring(1, s.length() - 1).split(",");
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int i = 0; i < split.length; i++) {
            cur.next = new ListNode(Integer.valueOf(split[i]));
            cur = cur.next;
        }

        ListNode listNode = reverseListNode(dummy.next);
        printList(listNode);
    }
}
