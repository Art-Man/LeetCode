//Given two binary strings, return their sum (also a binary string). 
//
// The input strings are both non-empty and contains only characters 1 or 0. 
//
// Example 1: 
//
// 
//Input: a = "11", b = "1"
//Output: "100" 
//
// Example 2: 
//
// 
//Input: a = "1010", b = "1011"
//Output: "10101" 
//
// 
// Constraints: 
//
// 
// Each string consists only of '0' or '1' characters. 
// 1 <= a.length, b.length <= 10^4 
// Each string is either "0" or doesn't contain any leading zero. 
// 
// Related Topics 数学 字符串


package leetcode.editor.cn;

//Java：二进制求和
public class P67AddBinary {
    public static void main(String[] args) {
        Solution solution = new P67AddBinary().new Solution();
        // TO TEST
        System.out.printf(solution.addBinary("11", "1") + "\n");
        System.out.printf(solution.addBinary("101", "1100") + "\n");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addBinary(String a, String b) {
            StringBuffer sb = new StringBuffer();
            int min;
            String maxStr;
            if (a.length()>b.length()) {
                min = b.length();
                maxStr = a;
            }else {
                min = a.length();
                maxStr = b;
            }
            int aLenght = a.length();
            int bLenght = b.length();
            boolean isAdd = false;
            int i = 1;
            for (; i <= min; i++) {
                char c = a.charAt(aLenght - i);
                char d = b.charAt(bLenght - i);
                if (c == '1' && d == '1') {
                    if (isAdd) sb.append('1');
                    else sb.append('0');
                    isAdd = true;
                } else if (c == '0' && d == '0') {
                    if (isAdd) {
                        sb.append('1');
                        isAdd = false;
                    }
                    else sb.append('0');
                }else sb.append('1');
            }
            for (; i < maxStr.length(); i++) {
                if (isAdd && maxStr.charAt(i) == '0') {
                    sb.append('1');
                } else if (isAdd && maxStr.charAt(i) == '1') {
                    sb.append('0');
                } else if (isAdd) {
                    sb.append('1');
                } else sb.append(maxStr.charAt(i));
            }
            return sb.reverse().toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
