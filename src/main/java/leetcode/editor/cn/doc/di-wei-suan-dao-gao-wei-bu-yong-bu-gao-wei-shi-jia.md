
```java
class Solution {
    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        //两个数都从最后一位向前加
        int carry = 0, i = a.length()-1, j = b.length()-1;
        while(i >= 0 || j >= 0 || carry != 0){
            //如果是“0”没用，是“1”，+1
            if(i >= 0) carry += a.charAt(i--)-'0';
            if(j >= 0) carry += b.charAt(j--)-'0';
            //当前这位2进制下的求余数
            sb.append(carry%2);
            //是否进位，只有0,1,2这三种
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}
