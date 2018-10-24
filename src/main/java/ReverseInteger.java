import java.util.HashMap;
import java.util.Map;

public class ReverseInteger {
    /**
     * 题目：反转整数
     * 给定一个 32 位有符号整数，将整数中的数字进行反转。
     * <p>
     * 示例 1:
     * <p>
     * 输入: 123
     * 输出: 321
     * 示例 2:
     * <p>
     * 输入: -123
     * 输出: -321
     * 示例 3:
     * <p>
     * 输入: 120
     * 输出: 21
     * 注意:
     * <p>
     * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^31 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
     */

    class Solution {
        public int reverse(int x) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            int i = 0;
            int n = x;
            while (n != 0) {
                int mod = n % 10;
                n = n / 10;
                map.put(i++, mod);
            }
            int ret = 0;
            for (i = map.size() - 1; i >= 0; i--) {
                ret += map.get(map.size() - i - 1) * Math.pow(10, i);
            }
            if (ret >= Integer.MAX_VALUE || ret <= Integer.MIN_VALUE) return 0;
            return ret;
        }
    }

    // 弹出和推入数字&溢出前检查（非使用辅助堆或栈，使用数学方法弹出或推入）（官方算法）
    class Solution2 {
        public int reverse(int x) {
            int rev = 0;
            while (x != 0) {
                int pop = x % 10;
                x /= 10;
                if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE && pop > 7)) return 0;
                if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE && pop < -8)) return 0;
                rev = rev * 10 + pop;
            }
            return rev;
        }
    }
}
