import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSumTest() {
        int[] nums = {2,7,11,15};
        int target=9;
        TwoSum.Solution s = new TwoSum().new Solution();
        int[] res = s.twoSum(nums,target);
        assertEquals("[0, 1]", Utils.integerArrayToString(res));

        int[] nums2={-3,0,3,4};
        target=0;
        res=s.twoSum(nums2,target);
        assertEquals("[0, 2]",Utils.integerArrayToString(res));
    }
}