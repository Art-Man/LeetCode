//Given a non-empty array of digits representing a non-negative integer, plus on
//e to the integer. 
//
// The digits are stored such that the most significant digit is at the head of 
//the list, and each element in the array contain a single digit. 
//
// You may assume the integer does not contain any leading zero, except the numb
//er 0 itself. 
//
// Example 1: 
//
// 
//Input: [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
// 
//
// Example 2: 
//
// 
//Input: [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
// Related Topics 数组


package leetcode.editor.cn;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;
import java.util.List;

//Java：加一
public class P66PlusOne {
    public static void main(String[] args) {
        Solution solution = new P66PlusOne().new Solution();
        // TO TEST
        int[] ints = new int[]{4, 3, 2, 1};
        for (int i : solution.plusOne(ints)) {
            System.out.printf(i + "\n");
        }
        System.out.printf("\n");
        ints = new int[]{9};
        for (int i : solution.plusOne(ints)) {
            System.out.printf(i + "\n");
        }
        System.out.printf("\n");
        ints = new int[]{9, 9, 9, 9};
        for (int i : solution.plusOne(ints)) {
            System.out.printf(i + "\n");
        }
        System.out.printf("\n");
        ints = new int[]{2, 9, 9, 9, 9};
        for (int i : solution.plusOne(ints)) {
            System.out.printf(i + "\n");
        }
        System.out.printf("\n");
        ints = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        for (int i : solution.plusOne(ints)) {
            System.out.printf(i + "\n");
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] plusOne(int[] digits) {
            if (digits == null || digits.length == 0) {
                return digits;
            }
            int i = digits.length - 1;
            while (i >= 0) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    return digits;
                }
                i--;
            }
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;

//            Integer t = 0;
//            for (int i = 0; i < digits.length; i++) {
//                t = t * 10 + digits[i];
//            }
//            t++;
//            List<Integer> integerList = new ArrayList<Integer>();
//            while (t > 0) {
//                integerList.add(t % 10);
//                t = t / 10;
//            }
//            digits = new int[integerList.size()];
//            for (int i = 0; i < digits.length; i++) {
//                digits[digits.length - i - 1] = integerList.get(i);
//            }
//            return digits;
//        if (digits[digits.length - 1] == 9) {
//            int[] d1 = new int[digits.length+1];
//            for (int i = 0; i < digits.length-1; i++) {
//                d1[i] = digits[i];
//            }
//            d1[digits.length - 1] = 1;
//            d1[digits.length] = 0;
//        }else digits[digits.length - 1]++;
//        return digits;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
