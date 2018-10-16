public class Utils {
    /**
     * Definition for singly-linked list.
     */
//    public class ListNode {
//        int val;
//        public ListNode next;
//        public ListNode(int x) { val = x; }
//    }

    /**
     * 将给定的字符串转化为ListNode
     *
     * @param input 字符串，格式为[2,4,3]
     * @return ListNode
     */
    public static AddTwoNumbers.ListNode stringToListNode(String input) {
        // 声明节点内的值数组
        int[] nodeValue = stringToIntegerArray(input);
        // 静态方法内无法实例化内部类，因为他俩同级，若需要实例化，必须先产生外部类，再来实例化内部类
        AddTwoNumbers.ListNode dummyRoot = new AddTwoNumbers().new ListNode(0);
        // 临时变量：指针
        AddTwoNumbers.ListNode ptr = dummyRoot;
        for (int item : nodeValue) {
            ptr.next = new AddTwoNumbers().new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    /**
     * 将给定的ListNode转化为字符串
     *
     * @param node ListNode
     * @return 字符串
     */
    public static String listNodeToString(AddTwoNumbers.ListNode node) {
        if (node == null) {
            return "[]";
        }

        String result = "";
        while (node != null) {
            result += node.val + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    /**
     * 将给定的字符串转化为整形数组
     *
     * @param input 输入格式必须为【1，2，3】
     * @return 整形数组
     */
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < output.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    /**
     * 将给定的整形数组转化为字符串
     *
     * @param nums   整形数组
     * @param length 输出子串长度
     * @return （子）字符串
     */
    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for (int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    /**
     * 将给定的整形数组全部输出
     *
     * @param nums 整形数组
     * @return 字符串
     */
    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }
}
