import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    /**
     * 题目：Z字形变换
     * 将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数：
     * <p>
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * 之后从左往右，逐行读取字符："PAHNAPLSIIGYIR"
     * <p>
     * 实现一个将字符串进行指定行数变换的函数:
     * <p>
     * string convert(string s, int numRows);
     * 示例 1:
     * <p>
     * 输入: s = "PAYPALISHIRING", numRows = 3
     * 输出: "PAHNAPLSIIGYIR"
     * 示例 2:
     * <p>
     * 输入: s = "PAYPALISHIRING", numRows = 4
     * 输出: "PINALSIGYAHRPI"
     * 解释:
     * <p>
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     */

    // 按行访问
    class Solution {
        public String convert(String s, int numRows) {
            if (s == null || s.length() == 0) return "";
            if (numRows == 1) return s;
            String result = "";
            int step = (numRows - 1) * 2;
            for (int i = 0; i < numRows; i++) {// i为行号，也为行起始
                // 循环定位点，先为起始值
                int position = i;
                int j = step - i * 2;// j为补充
                while (position < s.length()) {
                    result += s.charAt(position);
                    position += j;
                    if (j != 0 && position < s.length())
                        result += s.charAt(position);
                    // 若i为0的话，需要直接步进step确保不重复
                    position += i == 0 ? step : i * 2;
                }
            }
            return result;
        }
    }

    // 按行排序（官方解答，比较聪明）
    // 思路：遍历每个字符，看是往下走还是往上走，判断条件即为到顶还是到底，若遇到这两端，则方向取反
    class Solution2 {
        public String convert(String s, int numRows) {
            if (s == null || s.length() == 0) return "";
            if (numRows == 1) return s;

            // 存储每行字符串
            List<StringBuilder> rows = new ArrayList<StringBuilder>();
            for (int i = 0; i < Math.min(numRows, s.length()); i++) {
                rows.add(new StringBuilder());
            }
            // 设置方向
            int curRow = 0;
            boolean goingDown = false;
            for (char c : s.toCharArray()) {
                rows.get(curRow).append(c);
                if (curRow == 0 || curRow == rows.size() - 1) goingDown = !goingDown;
                curRow += goingDown ? 1 : -1;
            }

            StringBuilder ret = new StringBuilder();
            for (StringBuilder row:rows) ret.append(row);
            return ret.toString();
        }
    }
}
