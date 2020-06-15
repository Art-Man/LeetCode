### 解题思路
思路： 1：对数组进行排序
       2：定义二个指针 i，j  ，初始化为 i=0;j=0;
       3.用j指针进行遍历查找数组元素中等于val(目标元素)的元素；
       4.当找到第一个等于val的元素时，i指向它 保持不动。j继续编历剩下的元素，直到找到第一个不等于val的元素
       5.然后对剩下的元素进行循环遍历赋值  即 nums[i]=nums[j]; i ,j 指针分别后移，直到结束。
       6.具体思路参看源码理解 ，不懂留言 ，谢谢！
注意： 最后返回的是移除目标元素后的数组长度。


### 代码

```java
class Solution {
    public int removeElement(int[] nums, int val) {
      int len = nums.length;
      int i=0;
      boolean flag =false;
      Arrays.sort(nums);
      for (int j=0;j<len;j++){
          if(nums[j]!=val){
             nums[i]=nums[j];
             i++;
             if(flag){
                 for(int k=j+1;k<len;k++){
                     nums[i]=nums[k];
                     i++;
                     }
                 return i;
             }
          }else{
             flag= true; 
             if(j==len-1){
                 return i;
             }
          }
      }
      return len;
    }
}
```