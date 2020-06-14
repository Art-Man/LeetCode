//Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid. 
//
// An input string is valid if: 
//
// 
// Open brackets must be closed by the same type of brackets. 
// Open brackets must be closed in the correct order. 
// 
//
// Note that an empty string is also considered valid. 
//
// Example 1: 
//
// 
//Input: "()"
//Output: true
// 
//
// Example 2: 
//
// 
//Input: "()[]{}"
//Output: true
// 
//
// Example 3: 
//
// 
//Input: "(]"
//Output: false
// 
//
// Example 4: 
//
// 
//Input: "([)]"
//Output: false
// 
//
// Example 5: 
//
// 
//Input: "{[]}"
//Output: true
// 
// Related Topics 栈 字符串


package leetcode.editor.cn;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

//Java：有效的括号
public class P20ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new P20ValidParentheses().new Solution();
        // TO TEST
        System.out.printf(solution.isValid("()[]{}") + "\n");
        System.out.printf(solution.isValid("({})[{}]") + "\n");
        System.out.printf(solution.isValid("({[{}]})") + "\n");
        System.out.printf(solution.isValid("({[{({[{}]})}]})") + "\n");
        System.out.printf(solution.isValid("({[{({[{}]}}]})") + "\n");
        System.out.printf(solution.isValid("{[]}") + "\n");
        System.out.printf(solution.isValid("({[{}({[{}]}]}({[{}]})") + "\n");
        System.out.printf(solution.isValid("(}({[{}]})") + "\n");
        System.out.printf(solution.isValid("}({[{}]})") + "\n");
        System.out.printf(solution.isValid("]})") + "\n");
        System.out.printf(solution.isValid(")") + "\n");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            ArrayList<Integer> res = new ArrayList() {{
                add(0, 0);
            }};
//            LinkedList<Integer> res = new LinkedList<Integer>() {{
//                add(0, 0);
//            }};
            int currRes = 0;
            for (int i = 0; i < s.length(); i++) {
                int value = getValue(s.charAt(i));
                if (value > 0) {
                    res.add(currRes, value);
                    currRes++;
                } else if (currRes > 0){
                    if (res.get(currRes - 1) + value != 0) {
                        return false;
                    } else {
                        res.remove(currRes);
                        currRes--;
                        res.set(currRes, 0);
                    }
                } else return false;
            }
            if (res.size() == 1) {
                return true;
            }
            return false;
        }

        private int getValue(char c) {
            switch (c) {
                case '(':
                    return 1;
                case ')':
                    return -1;
                case '[':
                    return 2;
                case ']':
                    return -2;
                case '{':
                    return 3;
                case '}':
                    return -3;
                default:
                    return 0;
            }
        }

//        private final Map<Character, Character> map = new HashMap<Character, Character>() {{
//            put('{', '}');
//            put('[', ']');
//            put('(', ')');
//            put('?', '?');
//        }};
//
//        public boolean isValid(String s) {
//            if (s.length() > 0 && !map.containsKey(s.charAt(0))) return false;
//            LinkedList<Character> stack = new LinkedList<Character>() {{
//                add('?');
//            }};
//            for (Character c : s.toCharArray()) {
//                if (map.containsKey(c)) stack.addLast(c);
//                else if (map.get(stack.removeLast()) != c) return false;
//            }
//            return stack.size() == 1;
//        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
