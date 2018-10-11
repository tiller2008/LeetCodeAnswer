public class AddTwoNumbers {
    /**
     * 题目：
     * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
     *
     * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
     *
     * 示例：
     *
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     *
     *
     * 测试字符串：abcabcbb   期望结果：3
     * 测试字符串：bbbbbb   期望结果：1
     * 测试字符串：空字符串   期望结果：0
     * 测试字符串：空格   期望结果：1
     * 超长字符串：期待性能提升
     * 拓展：
     * 如果链表为（3->4->2)+(4->6->5)呢？
     *
     * 难度：中等
     */


    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        public ListNode next;
        public ListNode(int x) { val = x; }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result=new ListNode(0);
            ListNode a=l1;
            ListNode b=l2;
            ListNode curr=result;
            // 进位
            int carry=0;
            while(a!=null||b!=null)
            {
                int x=(a!=null)?a.val:0;
                int y=(b!=null)?b.val:0;
                int sum=carry+x+y;
                curr.next=new ListNode(sum % 10);
                curr=curr.next;
                carry=sum/10;
                if(a!=null) a=a.next;
                if(b!=null) b=b.next;
            }
            // 如示例中，数字A和B均为3位，切最终相加之和可能出现第4位，那么需要在循环结尾时，判断进位是否存在？若存在，则需要new第4位出来
            if(carry>0)
            {
                curr.next=new ListNode(carry);
            }
            return result.next;
        }

        // 打印链表
        public void print(ListNode listNode){
            ListNode p=listNode;
            while (p!=null){
                System.out.print(p.val);
                if (p.next!=null){
                    p=p.next;
                    System.out.print("->");
                }
                else
                    break;
            }
            System.out.println();
        }
    }
}