//Given a sorted array nums, remove the duplicates in-place such that each eleme
//nt appear only once and return the new length. 
//
// Do not allocate extra space for another array, you must do this by modifying 
//the input array in-place with O(1) extra memory. 
//
// Example 1: 
//
// 
//Given nums = [1,1,2],
//
//Your function should return length = 2, with the first two elements of nums be
//ing 1 and 2 respectively.
//
//It doesn't matter what you leave beyond the returned length. 
//
// Example 2: 
//
// 
//Given nums = [0,0,1,1,1,2,2,3,3,4],
//
//Your function should return length = 5, with the first five elements of nums b
//eing modified to 0, 1, 2, 3, and 4 respectively.
//
//It doesn't matter what values are set beyond the returned length.
// 
//
// Clarification: 
//
// Confused why the returned value is an integer but your answer is an array? 
//
// Note that the input array is passed in by reference, which means modification
// to the input array will be known to the caller as well. 
//
// Internally you can think of this: 
//
// 
//// nums is passed in by reference. (i.e., without making a copy)
//int len = removeDuplicates(nums);
//
//// any modification to nums in your function would be known by the caller.
//// using the length returned by your function, it prints the first len element
//s.
//for (int i = 0; i < len; i++) {
//    print(nums[i]);
//} Related Topics 数组 双指针


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//Java：删除排序数组中的重复项
public class P26RemoveDuplicatesFromSortedArray{
    public static void main(String[] args) {
        Solution solution = new P26RemoveDuplicatesFromSortedArray().new Solution();
        // TO TEST
        int[] ints = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int removeDuplicates = solution.removeDuplicates(ints);
        System.out.printf(removeDuplicates+"\n");
//        for (int i = 0; i < removeDuplicates; i++) {
//            System.out.printf(i+"\n");
//        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = 0;
        List<Integer> resNuns = new ArrayList<Integer>();
        resNuns.add(0, nums[res]);
        for (int i = 1; i < nums.length; i++) {
            if (resNuns.get(res) != nums[i]) {
                res++;
                resNuns.add(res, nums[i]);
            }
        }
        Integer[] integers = resNuns.toArray(new Integer[resNuns.size()]);
        for (int i = 0; i < integers.length; i++) {
            nums[i] = integers[i].intValue();
        }
        return res+1;

//        int res = 0;
//        int currNum = nums[0];
//        for (int num : nums) {
//            if (currNum != num) {
////                res = res * 10 + num;
//                res++;
//                currNum = num;
//            }
//        }
//        return res+1;
    }

//        public int removeDuplicates(int[] nums) {
//            if(nums == null || nums.length == 0) return 0;
//            int p = 0;
//            int q = 1;
//            while(q < nums.length){
//                if(nums[p] != nums[q]){
//                    nums[p + 1] = nums[q];
//                    p++;
//                }
//                q++;
//            }
//            return p + 1;
//        }
}
//leetcode submit region end(Prohibit modification and deletion)

}
