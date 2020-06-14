//Write a function to find the longest common prefix string amongst an array of 
//strings. 
//
// If there is no common prefix, return an empty string "". 
//
// Example 1: 
//
// 
//Input: ["flower","flow","flight"]
//Output: "fl"
// 
//
// Example 2: 
//
// 
//Input: ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
// 
//
// Note: 
//
// All given inputs are in lowercase letters a-z. 
// Related Topics 字符串


package leetcode.editor.cn;

//Java：最长公共前缀
public class P14LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new P14LongestCommonPrefix().new Solution();
        // TO TEST
//        System.out.printf(solution.longestCommonPrefix(new String[]{"1", "2", "3"}) + "\n");
//        System.out.printf(solution.longestCommonPrefix(new String[]{"234"}) + "\n");
//        System.out.printf(solution.longestCommonPrefix(new String[]{}) + "\n");
        System.out.printf(solution.longestCommonPrefix(new String[]{"abc", "ab", "abdf"}) + "\n");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            String res = "";
            if (strs.length >= 1) {
                for (int j = 0; j < strs[0].length(); j++) { // 字符串中的字符遍历
                    int i = 1;
                    for (; i < strs.length; i++) {  // 字符串数组遍历
                        if (strs[i].length() <= j || strs[0].charAt(j) != strs[i].charAt(j)) {
                            i--;
                            break;
                        }
                    }
                    if (i+1 < strs.length) {
                        return res;
                    }
                    res += strs[0].charAt(j);
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
