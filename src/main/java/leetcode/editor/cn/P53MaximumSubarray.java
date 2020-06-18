//Given an integer array nums, find the contiguous subarray (containing at least
// one number) which has the largest sum and return its sum. 
//
// Example: 
//
// 
//Input: [-2,1,-3,4,-1,2,1,-5,4],
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
// 
//
// Follow up: 
//
// If you have figured out the O(n) solution, try coding another solution using 
//the divide and conquer approach, which is more subtle. 
// Related Topics 数组 分治算法 动态规划


package leetcode.editor.cn;

//Java：最大子序和
public class P53MaximumSubarray {
    public static void main(String[] args) throws Exception {
        Solution solution = new P53MaximumSubarray().new Solution();
        // TO TEST
        System.out.printf((solution.maxSubArray(new int[]{1, -1, 1})==1) + "\n");
        System.out.printf((solution.maxSubArray(new int[]{-2, 1})==1) + "\n");
        System.out.printf((solution.maxSubArray(new int[]{-1, -2, 1})==1) + "\n");
        System.out.printf((solution.maxSubArray(new int[]{-100, -20, -12, -100, -20, -11})==-11) + "\n");
        System.out.printf((solution.maxSubArray(new int[]{-1, -2, -21})==-1) + "\n");
        System.out.printf((solution.maxSubArray(new int[]{-11, -1, -21})==-1) + "\n");
        System.out.printf((solution.maxSubArray(new int[]{4, -1, 2, 1})==6) + "\n");
        System.out.printf((solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})==6) + "\n");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSubArray(int[] nums) {
            int resMax = nums[0];
            for (int i = 0; i < nums.length; i++) {
                int curSum = nums[0];
                resMax = Math.max(resMax, curSum);
                for (int j = 1; j <= i; j++) {
                    curSum += nums[j];
                    resMax = Math.max(resMax, curSum);
                }
                curSum = nums[i];
                resMax = Math.max(resMax, curSum);
                for (int j = i-1; j > 0; j--) {
                    curSum += nums[j];
                    resMax = Math.max(resMax, curSum);
                }
            }
            return resMax;
//            int ans = nums[0];
//            int sum = 0;
//            for(int num: nums) {
//                if(sum > 0) {
//                    sum += num;
//                } else {
//                    sum = num;
//                }
//                ans = Math.max(ans, sum);
//            }
//            return ans;


//            for (int i = 0; i < nums.length - 1; i++) {
//                for (int j = i + 1; (j < i + 3 && j < nums.length); j++) {
//                    int tmp = nums[i] + nums[j];
//                    resMax = Math.max(resMax, tmp);
//                    resMax = Math.max(resMax, nums[j]);
//                }
//            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
