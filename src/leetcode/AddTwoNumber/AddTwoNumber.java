package leetcode.AddTwoNumber;

import model.ListNode;

public class AddTwoNumber {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1.next == null && l2.next == null) {
            int sum = l1.val + l2.val;

            if (sum < 10) {
                return new ListNode(sum);
            }

            return new ListNode(sum % 10, new ListNode(1));
        }

        ListNode root = new ListNode();
        sumNodeValue(l1, l2, root, 0);

        return root.next;
    }

    private ListNode sumNodeValue(ListNode node1, ListNode node2, ListNode currentNode, int value) {
        if (node1 == null && node2 == null) {
            if (value != 0) {
                currentNode.next = new ListNode(value);
            }
            return currentNode;
        }

        int sum = value;

        if (node1 != null) {
            sum += node1.val;
            node1 = node1.next;
        }
        if (node2 != null) {
            sum += node2.val;
            node2 = node2.next;
        }

        value = sum / 10;
        sum %= 10;

        currentNode.next = new ListNode(sum);

        return sumNodeValue(node1, node2, currentNode.next, value);
    }
}
