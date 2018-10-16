public class MedianOfTwoSortedArrays {
    /**
     * 题目：两个排序数组的中位数
     * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。
     * <p>
     * 请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。
     * <p>
     * 你可以假设 nums1 和 nums2 不同时为空。
     * <p>
     * 示例 1:
     * <p>
     * nums1 = [1, 3]
     * nums2 = [2]
     * <p>
     * 中位数是 2.0
     * 示例 2:
     * <p>
     * nums1 = [1, 2]
     * nums2 = [3, 4]
     * <p>
     * 中位数是 (2 + 3)/2 = 2.5
     * <p>
     * 难易程度：困难
     * <p>
     * 测试时，需要考虑空数组，负数，总个数在单数或双数
     */

    class Solution {
        /**
         * 简单思路：
         * 1. 两个数组有序合并(若其中一个数组为空，则直接为非空数组作为合并后数组)
         * 2. 合并后长度若为奇数，则为中间一个数；否则为中间俩数之和/2
         *
         * 深入思路：
         * 切割：确保左边和右边的数量相等，并左上<=右下且左下<=右上，这样就是中位数
         */

        public double findMedianSortedArrays(int[] A, int[] B) {
            int m = A.length, n = B.length;
            // 这样做可以使得，当n个数大于等于m的个数时，j>0或j<n始终成立
            if (m > n) {
                int[] temp = A;
                A = B;
                B = temp;
                int tmp = m;
                m = n;
                n = tmp;
            }

            // 将i的搜索范围定在0~m
            int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
            while (iMin <= iMax) {
                // 确保切割后left与right个数相等
                int i = (iMax + iMin) / 2;
                int j = halfLen - i;

                if (i < iMax && A[i] < B[j - 1])
                    iMin = i + 1;// 右上存在，且右上<左下，说明i太小，需要右移
                else if (i > iMin && A[i - 1] > B[j])
                    iMax = i - 1;// 左上存在，且左上>右下，说明i太大，需要左移
                else {// i刚刚好
                    int leftMax = 0;
                    if (i == 0) leftMax = B[j - 1];// 左上无，leftMax取左下
                    else if (j == 0) leftMax = A[i - 1];// 左下无，leftMax取左上
                    else leftMax = Math.max(A[i - 1], B[j - 1]);// 均有值，取最大值
                    if (((m + n) & 1) == 1) return leftMax;// 俩数组总个数为奇数

                    int rightMin = 0;
                    if (i == m) rightMin = B[j];// 右上无，rightMin取右下
                    else if (j == n) rightMin = A[i];// 右下无，rightMin取右上
                    else rightMin = Math.min(A[i], B[j]);// 均有值，取最小值
                    if ((((m + n) & 1) == 1)) return rightMin;// 俩数组总个数为奇数

                    return (((double)leftMax + (double)rightMin) / 2);// 俩数组总个数为偶数，（左最大+右最小)/2
                }
            }
            return 0.0;
        }
    }
}
