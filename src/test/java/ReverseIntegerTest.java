import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ReverseIntegerTest {
    @Test
    void reverseIntegerTest(){
        assertEquals(321,new ReverseInteger().new Solution().reverse(123));
        assertEquals(-321,new ReverseInteger().new Solution().reverse(-123));
        assertEquals(21,new ReverseInteger().new Solution().reverse(120));
        assertEquals(1,new ReverseInteger().new Solution().reverse(1));
        assertEquals(0,new ReverseInteger().new Solution().reverse(1534236469));
    }
    @Test
    void reverseIntegerTest2(){
        assertEquals(321,new ReverseInteger().new Solution2().reverse(123));
        assertEquals(-321,new ReverseInteger().new Solution2().reverse(-123));
        assertEquals(21,new ReverseInteger().new Solution2().reverse(120));
        assertEquals(1,new ReverseInteger().new Solution2().reverse(1));
        assertEquals(0,new ReverseInteger().new Solution2().reverse(1534236469));
    }
}
