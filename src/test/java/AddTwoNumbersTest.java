import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    @Test
    void addTwoNumbersTest() {
        // (2 -> 4 -> 3) + (5 -> 6 -> 4)
        String a = "[2,4,3]", b = "[5,6,4]";
        assertEquals("[7, 0, 8]",
                Utils.listNodeToString(
                        new AddTwoNumbers().
                                new Solution().addTwoNumbers(Utils.stringToListNode(a), Utils.stringToListNode(b))));

        // (9 -> 9) + 1
        a = "[9,9]";
        b = "[1]";
        assertEquals("[0, 0, 1]",
                Utils.listNodeToString(
                        new AddTwoNumbers().
                                new Solution().addTwoNumbers(Utils.stringToListNode(a), Utils.stringToListNode(b))));

        // (9 -> 9) + 1
        a = "[]";
        b = "[1]";
        assertEquals("[1]",
                Utils.listNodeToString(
                        new AddTwoNumbers().
                                new Solution().addTwoNumbers(Utils.stringToListNode(a), Utils.stringToListNode(b))));
    }
}