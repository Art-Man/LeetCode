//Given a string s consists of upper/lower-case alphabets and empty space charac
//ters ' ', return the length of last word (last word means the last appearing wor
//d if we loop from left to right) in the string. 
//
// If the last word does not exist, return 0. 
//
// Note: A word is defined as a maximal substring consisting of non-space charac
//ters only. 
//
// Example: 
//
// 
//Input: "Hello World"
//Output: 5
// 
//
// 
// Related Topics 字符串


package leetcode.editor.cn;

//Java：最后一个单词的长度
public class P58LengthOfLastWord {
    public static void main(String[] args) {
        Solution solution = new P58LengthOfLastWord().new Solution();
        // TO TEST
        System.out.printf(solution.lengthOfLastWord("a ") + "\n");
        System.out.printf(solution.lengthOfLastWord("a") + "\n");
        System.out.printf(solution.lengthOfLastWord(" ") + "\n");
        System.out.printf(solution.lengthOfLastWord("Hello World") + "\n");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLastWord(String s) {
            int res = 0;
            s = s.replaceAll("[　 ]+$", "");
            for (int i = s.length() - 1; i >= 0; i--) {
                if (' ' == s.charAt(i)) {
                    break;
                }  else res++;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
