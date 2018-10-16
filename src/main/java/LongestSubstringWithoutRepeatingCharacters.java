import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    /**
     * 题目：无重复字符的最长子串
     * 给定一个字符串，找出不含有重复字符的最长子串的长度。
     * <p>
     * 示例 1:
     * <p>
     * 输入: "abcabcbb"
     * 输出: 3
     * 解释: 无重复字符的最长子串是 "abc"，其长度为 3。
     * 示例 2:
     * <p>
     * 输入: "bbbbb"
     * 输出: 1
     * 解释: 无重复字符的最长子串是 "b"，其长度为 1。
     * 示例 3:
     * <p>
     * 输入: "pwwkew"
     * 输出: 3
     * 解释: 无重复字符的最长子串是 "wke"，其长度为 3。
     * 请注意，答案必须是一个子串，"pwke" 是一个子序列 而不是子串。
     * <p>
     * <p>
     * 测试字符串：abcabcbb   期望结果：3
     * 测试字符串：bbbbbb   期望结果：1
     * 测试字符串：空字符串   期望结果：0
     * 测试字符串：空格   期望结果：1
     * 超长字符串：期待性能提升
     */


// 暴力法
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int maxLength = 0;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    if (!hasRepeat(s.substring(i, j).toCharArray())) {
                        if (maxLength <= s.substring(i, j).length())
                            maxLength = s.substring(i, j).length();
                    } else
                        break;
                }
            }
            return maxLength;
        }

        private boolean hasRepeat(char[] arr) {
            Map map = new HashMap();
            if (arr != null) {
                map.put(arr[0], 0);
                for (int i = 1; i < arr.length; i++) {
                    char complement = arr[i];
                    if (map.containsKey(complement))
                        return true;
                    map.put(arr[i], i);
                }
            }
            return false;
        }
    }

    // 滑动窗口
    class Solution2 {
        public int lengthOfLongestSubstring(String s) {
            int maxlen = 0;
            for (int i = 0, j = 1; i < s.length() && j <= s.length(); ) {
                if (!hasRepeat(s, i, j)) {
                    // 若无重复，则后标往后移，且最大长度进行判断后赋值
                    maxlen = Math.max(maxlen, j - i);
                    j++;
                } else {
                    // 否则，前标向后移
                    i++;
                }
            }
            return maxlen;
        }

        // 判断传入的子串是否存在重复字符
        private boolean hasRepeat(String s, int start, int end) {
            Set set = new HashSet();
            for (int i = start; i < end; i++) {
                // 如果存在，直接返回true
                if (set.contains(s.charAt(i))) {
                    return true;
                }
                // 否则存入set
                set.add(s.charAt(i));
            }
            return false;
        }

    }

    // 滑动窗口（官方解答）
    class Solution3 {
        public int lengthOfLongestSubstring(String s) {
            int n = s.length();
            Set<Character> set = new HashSet<Character>();
            int ans = 0, i = 0, j = 0;
            while (i < n && j < n) {
                // 在同一循环中，复杂度较上一方法降低一个级别
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j++));
                    ans = Math.max(ans, j - i);
                } else {
                    // 若出现重复，则集合中删除重复的字符，并向后移
                    set.remove(s.charAt(i++));
                }
            }
            return ans;
        }
    }

    // 优化的滑动窗口
    class Solution4 {
        public int lengthOfLongestSubstring(String s) {
            int n = s.length();
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            int ans = 0;
            for (int i = 0, j = 0; j < n; j++) {
                if (map.containsKey(s.charAt(j))) {
                    // 若存在重复，则将前标直接移到当前重复的字符后
                    i = Math.max(map.get(s.charAt(j)), i);
                }
                ans = Math.max(ans, j - i + 1);
                map.put(s.charAt(j), j + 1);
            }
            return ans;
        }
    }
}