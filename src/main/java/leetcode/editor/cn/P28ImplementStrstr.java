//Implement strStr(). 
//
// Return the index of the first occurrence of needle in haystack, or -1 if need
//le is not part of haystack. 
//
// Example 1: 
//
// 
//Input: haystack = "hello", needle = "ll"
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: haystack = "aaaaa", needle = "bba"
//Output: -1
// 
//
// Clarification: 
//
// What should we return when needle is an empty string? This is a great questio
//n to ask during an interview. 
//
// For the purpose of this problem, we will return 0 when needle is an empty str
//ing. This is consistent to C's strstr() and Java's indexOf(). 
// Related Topics 双指针 字符串


package leetcode.editor.cn;

//Java：实现 strStr()
public class P28ImplementStrstr {
    public static void main(String[] args) {
        Solution solution = new P28ImplementStrstr().new Solution();
        // TO TEST
        System.out.printf(solution.strStr("hello", "ll") + "\n");
        System.out.printf(solution.strStr("hello", "") + "\n");
        System.out.printf(solution.strStr("", "ll") + "\n");
        System.out.printf(solution.strStr("a", "") + "\n");
        System.out.printf(solution.strStr("", "") + "\n");
        System.out.printf(solution.strStr(null, "ll") + "\n");
        System.out.printf(solution.strStr("null", "llll") + "\n");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int strStr(String haystack, String needle) {
            if (haystack==null||needle==null||(haystack.length() == 0 && needle.length() != 0)) {
                return -1;
            } else if ((haystack.length() == 0 && needle.length() == 0 )||(haystack.length() != 0 && needle.length() == 0)) {
                return 0;
            }
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i)==needle.charAt(0)) {
                    Boolean isOK = true;
                    for (int j = 1; j < needle.length(); j++) {
                        if (i+j>=haystack.length() || haystack.charAt(i + j) != needle.charAt(j) ) {
                            isOK = false;
                            break;
                        }
                    }
                    if (isOK) {
                        return i;
                    }
                }
            }
            return -1;
        }
    }

//    class Solution {
//        public int strStr(String haystack, String needle) {
//            if (haystack==null||needle==null||(haystack.length() == 0 && needle.length() != 0)) {
//                return -1;
//            } else if ((haystack.length() == 0 && needle.length() == 0 )||(haystack.length() != 0 && needle.length() == 0)) {
//                return 0;
//            }
//            char[] chars = haystack.toCharArray();
//            for (int i = 0; i < chars.length; i++) {
//                if (chars[i]==needle.charAt(0)) {
//                    Boolean isOK = true;
//                    for (int j = 1; j < needle.length(); j++) {
//                        if (i+j>=chars.length || chars[i + j] != needle.charAt(j) ) {
//                            isOK = false;
//                            break;
//                        }
//                    }
//                    if (isOK) {
//                        return i;
//                    }
//                }
//            }
//            return -1;
//        }
//    }
//leetcode submit region end(Prohibit modification and deletion)

}
