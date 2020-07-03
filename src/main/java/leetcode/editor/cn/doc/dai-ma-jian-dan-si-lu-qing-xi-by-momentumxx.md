 [Screenshot from 2020-06-03 22-10-47.png](https://pic.leetcode-cn.com/ec61944f46aaf8804e9d8e65e131867b814281273973b255f4acadc51e883581-Screenshot%20from%202020-06-03%2022-10-47.png)

### 解题思路
通过sum值的不同来规定不同的行为

### 代码

```java
class Solution {
    public String addBinary(String a, String b) {
        int aIdx = a.length() - 1;
        int bIdx = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while (aIdx >= 0 || bIdx >= 0 || carry == 1) {
            int aValue = aIdx < 0 ? 0 : Integer.parseInt(String.valueOf(a.charAt(aIdx)));
            aIdx--;
            int bValue = bIdx < 0 ? 0 : Integer.parseInt(String.valueOf(b.charAt(bIdx)));
            bIdx--;
            int sum = aValue + bValue + carry;
            carry = 0;
            if (sum == 0) {
                sb.append(0);
            } else if (sum == 1) {
                sb.append(1);
            } else if (sum == 2) {
                sb.append(0);
                carry = 1;
            } else {
                sb.append(1);
                carry = 1;
            }
        }
        return sb.reverse().toString();
    }
}
```