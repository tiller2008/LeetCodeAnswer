import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ZigzagConversionTest {
    @Test
    void zigzagConversionTest(){
        assertEquals("PAHNAPLSIIGYIR",new ZigzagConversion().new Solution().convert("PAYPALISHIRING",3));
        assertEquals("PINALSIGYAHRPI",new ZigzagConversion().new Solution().convert("PAYPALISHIRING",4));
        assertEquals("PHASIYIRPLIGAN",new ZigzagConversion().new Solution().convert("PAYPALISHIRING",5));
        assertEquals("P",new ZigzagConversion().new Solution().convert("P",2));
    }
    @Test
    void zigzagConversionTest2(){
        assertEquals("PAHNAPLSIIGYIR",new ZigzagConversion().new Solution2().convert("PAYPALISHIRING",3));
        assertEquals("PINALSIGYAHRPI",new ZigzagConversion().new Solution2().convert("PAYPALISHIRING",4));
        assertEquals("PHASIYIRPLIGAN",new ZigzagConversion().new Solution2().convert("PAYPALISHIRING",5));
        assertEquals("P",new ZigzagConversion().new Solution2().convert("P",3));
    }
}
