//Determine whether an integer is a palindrome. An integer is a palindrome when 
//it reads the same backward as forward. 
//
// Example 1: 
//
// 
//Input: 121
//Output: true
// 
//
// Example 2: 
//
// 
//Input: -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes
// 121-. Therefore it is not a palindrome.
// 
//
// Example 3: 
//
// 
//Input: 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
// 
//
// Follow up: 
//
// Coud you solve it without converting the integer to a string? 
// Related Topics 数学


package leetcode.editor.cn;

//Java：回文数
public class P9PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new P9PalindromeNumber().new Solution();
        // TO TEST
        System.out.printf(String.valueOf(solution.isPalindrome(123)) + "\n");
        System.out.printf(String.valueOf(solution.isPalindrome(121)) + "\n");
        System.out.printf(String.valueOf(solution.isPalindrome(-121)) + "\n");
        System.out.printf(String.valueOf(solution.isPalindrome(0)) + "\n");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(int x) {
//            if (x<0) return false;
            int def = x;
            int res = 0;
            while (x != 0) {
                int pop = x % 10;
                x = x / 10;
                res = res * 10 + pop;
            }
            if (res == def && def >= 0) {
                return true;
            } else {
                return false;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
