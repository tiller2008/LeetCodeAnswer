import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {
    @Test
    void longestPalindromicSubstringTest() {
        assertEquals("aba", new LongestPalindromicSubstring().
                new Solution().longestPalindrome("babad"));
        assertEquals("bb", new LongestPalindromicSubstring().
                new Solution().longestPalindrome("cbbd"));
        assertEquals("baab", new LongestPalindromicSubstring().
                new Solution().longestPalindrome("baab"));
        assertEquals("d", new LongestPalindromicSubstring().
                new Solution().longestPalindrome("abcd"));
        assertEquals("", new LongestPalindromicSubstring().
                new Solution().longestPalindrome(""));
        assertEquals(" ", new LongestPalindromicSubstring().
                new Solution().longestPalindrome(" "));
        assertEquals("a", new LongestPalindromicSubstring().
                new Solution().longestPalindrome("a"));
        assertEquals("a", new LongestPalindromicSubstring().
                new Solution().longestPalindrome("abcda"));
    }
}
