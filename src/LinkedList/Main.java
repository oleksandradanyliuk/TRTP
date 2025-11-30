package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: l1 = [1,2,4], l2 = [1,3,4]
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode merged1 = solution.mergeTwoLists(l1, l2);
        System.out.print("Example 1: ");
        merged1.printList();

        // Example 2: l1 = [], l2 = []
        ListNode l3 = null;
        ListNode l4 = null;
        ListNode merged2 = solution.mergeTwoLists(l3, l4);
        System.out.print("Example 2: ");
        if (merged2 != null) merged2.printList();
        else System.out.println("[]");

        // Example 3: l1 = [], l2 = [0]
        ListNode l5 = null;
        ListNode l6 = new ListNode(0);
        ListNode merged3 = solution.mergeTwoLists(l5, l6);
        System.out.print("Example 3: ");
        merged3.printList();

        // ----------------------
        // Використання LinkedList та Collections
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        Collections.addAll(list1, 1, 2, 4);
        Collections.addAll(list2, 1, 3, 4);

        list1.addAll(list2);
        Collections.sort(list1);

        System.out.print("Merged using LinkedList & Collections: ");
        System.out.println(list1);
    }
}
