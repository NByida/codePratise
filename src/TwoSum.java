public class TwoSum {


    /**
     * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
     * <p>
     * 请你将两个数相加，并以相同形式返回一个表示和的链表。
     * <p>
     * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/add-two-numbers
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] ars) {
        ListNode l = new ListNode();
        l.val = 1;
        ListNode l1 = new ListNode();
        l1.val = 4;
        l.next = l1;
        ListNode l2 = new ListNode();
        l2.val = 3;
        l1.next = l2;

        ListNode r = new ListNode();
        r.val = 0;
        ListNode r1 = new ListNode();
        r1.val = 9;
        r.next = r1;
        ListNode r2 = new ListNode();
        r2.val = 9;
        r1.next = r2;

        ListNode r3 = new ListNode();
        r3.val = 9;
        r2.next = r3;

        ListNode r4 = new ListNode();
        r4.val = 9;
        r3.next = r4;

        ListNode r5 = new ListNode();
        r5.val = 9;
        r4.next = r5;

        ListNode r6 = new ListNode();
        r6.val = 9;
        r5.next = r6;

        ListNode r7 = new ListNode();
        r7.val = 9;
        r6.next = r7;

        ListNode r8 = new ListNode();
        r8.val = 9;
        r7.next = r8;

        ListNode r9 = new ListNode();
        r9.val = 9;
        r8.next = r9;
//
        ListNode res = addTwoNumber(l, r);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;

        }


    }

    /**
     * 1  1
     * 1-9-9  991
     * 1000
     * 9-9-6  699
     * ！！！此做法测试用例不过，当相加值超过2^31-1时会溢出
     * 1 反转l1
     * 2 反转l2
     * 3 l1+l2
     * 4 反转 l1+l2
     * 边界：链表长度为1
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l = 0, j = 1;
        int r = 0, k = 1;
        while (l1 != null) {
            l += l1.val * j;
            l1 = l1.next;
            j *= 10;
        }
        while (l2 != null) {
            r += l2.val * k;
            l2 = l2.next;
            k *= 10;
        }
        int res = l + r;
        ListNode node = new ListNode();
        ListNode lastNode = new ListNode();
        while (res / 10 != 0 || node.next == null) {
            lastNode.val = res % 10;
            ListNode n = new ListNode();
            lastNode.next = n;
            if (node.next == null) {
                node = lastNode;
            }
            lastNode = n;
            res /= 10;
        }
        lastNode.val = res % 10;
        return node;
    }

    /**
     * 、
     * 自己做的
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumber(ListNode l1, ListNode l2) {
        int l = 0, r = 0, isAdd = 0;
        ListNode node = null, last = null;
        while (l1 != null || l2 != null) {
            l = (l1 == null) ? 0 : l1.val;
            r = (l2 == null) ? 0 : l2.val;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            int add = l + r + isAdd;
            isAdd = (add / 10 >= 1) ? 1 : 0;
            add %= 10;
            if (node == null) {
                node = last = new ListNode(add);
            } else {
                last.next = new ListNode(add);
                last = last.next;
            }
        }
        if (isAdd != 0) {
            last.next = new ListNode(isAdd);
        }
        return node;
    }


    /**
     * 官方题解
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }


}
