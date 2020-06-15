//Given a sorted array and a target value, return the index if the target is fou
//nd. If not, return the index where it would be if it were inserted in order. 
//
// You may assume no duplicates in the array. 
//
// Example 1: 
//
// 
//Input: [1,3,5,6], 5
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: [1,3,5,6], 2
//Output: 1
// 
//
// Example 3: 
//
// 
//Input: [1,3,5,6], 7
//Output: 4
// 
//
// Example 4: 
//
// 
//Input: [1,3,5,6], 0
//Output: 0
// 
// Related Topics 数组 二分查找


package leetcode.editor.cn;

//Java：搜索插入位置
public class P35SearchInsertPosition {
    public static void main(String[] args) {
        Solution solution = new P35SearchInsertPosition().new Solution();
        // TO TEST
        System.out.printf(solution.searchInsert(new int[]{1, 3, 5, 6}, 5) + "\n");
        System.out.printf(solution.searchInsert(new int[]{1, 3, 5, 6}, 2) + "\n");
        System.out.printf(solution.searchInsert(new int[]{1, 3, 5, 6}, 7) + "\n");
        System.out.printf(solution.searchInsert(new int[]{1, 3, 5, 7}, 0) + "\n");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int searchInsert(int[] nums, int target) {
            if (nums == null || nums.length == 0) {
                return -1;
            }
            int res = 0;
            for (int num : nums) {
                if (num >= target) {
                    break;
                } else {
                    res++;
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
