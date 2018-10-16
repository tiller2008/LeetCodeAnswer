import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {
    @Test
    void medianOfTwoSortedArraysTest() {
        String nums1, nums2;

        nums1 = "[1,2]";
        nums2 = "[3,4]";
        assertEquals(2.5, new MedianOfTwoSortedArrays().
                new Solution().findMedianSortedArrays(Utils.stringToIntegerArray(nums1), Utils.stringToIntegerArray(nums2)));

        nums1 = "[1,2]";
        nums2 = "[3]";
        assertEquals(2.0, new MedianOfTwoSortedArrays().
                new Solution().findMedianSortedArrays(Utils.stringToIntegerArray(nums1), Utils.stringToIntegerArray(nums2)));

        nums1 = "[4]";
        nums2 = "[1]";
        assertEquals(2.5, new MedianOfTwoSortedArrays().
                new Solution().findMedianSortedArrays(Utils.stringToIntegerArray(nums1), Utils.stringToIntegerArray(nums2)));

        nums1 = "[3,4]";
        nums2 = "[1]";
        assertEquals(3.0, new MedianOfTwoSortedArrays().
                new Solution().findMedianSortedArrays(Utils.stringToIntegerArray(nums1), Utils.stringToIntegerArray(nums2)));

        nums1 = "[3,4]";
        nums2 = "[]";
        assertEquals(3.5, new MedianOfTwoSortedArrays().
                new Solution().findMedianSortedArrays(Utils.stringToIntegerArray(nums1), Utils.stringToIntegerArray(nums2)));

        nums1 = "[]";
        nums2 = "[1]";
        assertEquals(1.0, new MedianOfTwoSortedArrays().
                new Solution().findMedianSortedArrays(Utils.stringToIntegerArray(nums1), Utils.stringToIntegerArray(nums2)));

        nums1 = "[1,2,3,4,5]";
        nums2 = "[2,3,4,5]";
        assertEquals(3.0, new MedianOfTwoSortedArrays().
                new Solution().findMedianSortedArrays(Utils.stringToIntegerArray(nums1), Utils.stringToIntegerArray(nums2)));

        nums1 = "[1,2,3,4,5]";
        nums2 = "[2,6,7,8]";
        assertEquals(4.0, new MedianOfTwoSortedArrays().
                new Solution().findMedianSortedArrays(Utils.stringToIntegerArray(nums1), Utils.stringToIntegerArray(nums2)));

        nums1 = "[1,2,3,4,5]";
        nums2 = "[2,2,2,8]";
        assertEquals(2.0, new MedianOfTwoSortedArrays().
                new Solution().findMedianSortedArrays(Utils.stringToIntegerArray(nums1), Utils.stringToIntegerArray(nums2)));
    }

}