package leetcode.AddTwoNumber;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import model.ListNode;
import org.junit.jupiter.api.Test;

public class AddTwoNumberTest {

    @Test
    void testAll() {
        assertAll(
            () -> test(ListNode.of(2, 4, 3), ListNode.of(5, 6, 4), ListNode.of(7, 0, 8)),
            () -> test(ListNode.of(9, 9, 9, 9, 9, 9, 9), ListNode.of(9, 9, 9, 9), ListNode.of(8, 9, 9, 9, 0, 0, 0, 1))
        );
    }

    private void test(ListNode node1, ListNode node2, ListNode expected) {

        AddTwoNumber solution = new AddTwoNumber();
        ListNode actual = solution.addTwoNumbers(node1, node2);

        // then
        assertEquals(expected, actual);
    }
}