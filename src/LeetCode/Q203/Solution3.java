package LeetCode.Q203;

public class Solution3 {
    public ListNode removeElements(ListNode head,int val){
        if (head == null){
            return null;
        }
        ListNode res = removeElements(head.next,val);//递归调用
        if (head.val == val){
            return res;//删除节点发生在该步
        }else {
            head.next = res;
            return head;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution3()).removeElements(head,6);
        System.out.println(res);
    }
}
