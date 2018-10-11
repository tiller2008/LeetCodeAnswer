import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    void longestSubstringWithoutRepeatingCharactersTest(){
        String a="abcabcbb";
        assertEquals(3,new LongestSubstringWithoutRepeatingCharacters().new Solution().lengthOfLongestSubstring(a));
        a="bbbbb";
        assertEquals(1,new LongestSubstringWithoutRepeatingCharacters().new Solution().lengthOfLongestSubstring(a));
        a="pwwkew";
        assertEquals(3,new LongestSubstringWithoutRepeatingCharacters().new Solution().lengthOfLongestSubstring(a));
        a="";
        assertEquals(0,new LongestSubstringWithoutRepeatingCharacters().new Solution().lengthOfLongestSubstring(a));
        a=" ";
        assertEquals(1,new LongestSubstringWithoutRepeatingCharacters().new Solution().lengthOfLongestSubstring(a));
    }


    // 方法2
    @Test
    void longestSubstringWithoutRepeatingCharactersTest2(){
        String a="abcabcbb";
        assertEquals(3,new LongestSubstringWithoutRepeatingCharacters().new Solution2().lengthOfLongestSubstring(a));
        a="bbbbb";
        assertEquals(1,new LongestSubstringWithoutRepeatingCharacters().new Solution2().lengthOfLongestSubstring(a));
        a="pwwkew";
        assertEquals(3,new LongestSubstringWithoutRepeatingCharacters().new Solution2().lengthOfLongestSubstring(a));
        a="";
        assertEquals(0,new LongestSubstringWithoutRepeatingCharacters().new Solution2().lengthOfLongestSubstring(a));
        a=" ";
        assertEquals(1,new LongestSubstringWithoutRepeatingCharacters().new Solution2().lengthOfLongestSubstring(a));
    }

    @Test
    void longestSubstringWithoutRepeatingCharactersTest3(){
        String a="abcabcbb";
        assertEquals(3,new LongestSubstringWithoutRepeatingCharacters().new Solution3().lengthOfLongestSubstring(a));
        a="bbbbb";
        assertEquals(1,new LongestSubstringWithoutRepeatingCharacters().new Solution3().lengthOfLongestSubstring(a));
        a="pwwkew";
        assertEquals(3,new LongestSubstringWithoutRepeatingCharacters().new Solution3().lengthOfLongestSubstring(a));
        a="";
        assertEquals(0,new LongestSubstringWithoutRepeatingCharacters().new Solution3().lengthOfLongestSubstring(a));
        a=" ";
        assertEquals(1,new LongestSubstringWithoutRepeatingCharacters().new Solution3().lengthOfLongestSubstring(a));
    }

    @Test
    void longestSubstringWithoutRepeatingCharactersTest4(){
        String a="abcabcbb";
        assertEquals(3,new LongestSubstringWithoutRepeatingCharacters().new Solution4().lengthOfLongestSubstring(a));
        a="bbbbb";
        assertEquals(1,new LongestSubstringWithoutRepeatingCharacters().new Solution4().lengthOfLongestSubstring(a));
        a="pwwkew";
        assertEquals(3,new LongestSubstringWithoutRepeatingCharacters().new Solution4().lengthOfLongestSubstring(a));
        a="";
        assertEquals(0,new LongestSubstringWithoutRepeatingCharacters().new Solution4().lengthOfLongestSubstring(a));
        a=" ";
        assertEquals(1,new LongestSubstringWithoutRepeatingCharacters().new Solution4().lengthOfLongestSubstring(a));
    }
}