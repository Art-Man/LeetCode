//Given a 32-bit signed integer, reverse digits of an integer. 
//
// Example 1: 
//
// 
//Input: 123
//Output: 321
// 
//
// Example 2: 
//
// 
//Input: -123
//Output: -321
// 
//
// Example 3: 
//
// 
//Input: 120
//Output: 21
// 
//
// Note: 
//Assume we are dealing with an environment which could only store integers with
//in the 32-bit signed integer range: [−231, 231 − 1]. For the purpose of this pro
//blem, assume that your function returns 0 when the reversed integer overflows. 
// Related Topics 数学


package leetcode.editor.cn;

//Java：整数反转
public class P7ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new P7ReverseInteger().new Solution();
        // TO TEST
        System.out.printf(String.valueOf(solution.reverse(1534236469)) + "\n");
        System.out.printf(String.valueOf(Integer.MAX_VALUE) + "  " + String.valueOf(Integer.MIN_VALUE + "\n"));
        System.out.printf(String.valueOf(solution.reverse(-2147483641)) + "\n");
        System.out.printf(String.valueOf(solution.reverse(2147483642)) + "\n");
        System.out.printf(String.valueOf(solution.reverse(-1534236469)) + "\n");
        System.out.printf(String.valueOf(solution.reverse(2143847412)) + "\n");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverse(int x) {
            int res = 0;
            int max = Integer.MAX_VALUE / 10;
            int min = Integer.MIN_VALUE / 10;
            while (x != 0) {
                int pop = x % 10;
                if ((res > max || (max == res && pop > 7)) || (res < min || (min == res && pop < -8))) return 0;
//                if (res > max || (max == res && pop > 7)) return 0;
//                if (res < min || (min == res && pop < -8)) return 0;
//                if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE / 10 && pop > 7))
//                    return 0;
//                if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE / 10 && pop < -8))
//                    return 0;
                x = x / 10;
                res = res * 10 + pop;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
