class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        while (l1 != null) {
            q1.offer(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            q2.offer(l2.val);
            l2 = l2.next;
        }

        ListNode newNode = new ListNode(0);
        ListNode curr = newNode;
        int sum = 0;
        while (!q1.isEmpty() || !q2.isEmpty() || sum != 0) {

            if (!q1.isEmpty()) {
                sum += q1.poll();
            }

            if (!q2.isEmpty()) {
                sum += q2.poll();
            }

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            sum /= 10;
        }

       return newNode.next;
    }
}