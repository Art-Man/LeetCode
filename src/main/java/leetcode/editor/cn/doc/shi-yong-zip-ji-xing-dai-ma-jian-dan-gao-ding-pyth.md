#### 方法一 zip合并
- __解题思路__：
    - 使用 __zip__ 根据字符串下标合并成数组，
    - 判断合并后数组里元素是否都相同
- __复杂度分析__：
    - 时间复杂度 *O(N)* ，*N* 表示数组中最短字符串长度
    - 空间复杂度 *O(1)* ，使用的变量为自然数个

```python []
class Solution(object):
    def longestCommonPrefix(self, strs):
        ans = ''
        for i in zip(*strs):
            if len(set(i)) == 1:
                ans += i[0]
            else:
                break
        return ans
```

- 这个例子是 __菜鸟编程__ 里关于 __zip函数__ 介绍 [Python zip() 函数](https://www.runoob.com/python/python-func-zip.html)
- __如果你也发现了，请为自己点赞，顺便为小牛点赞👍支持__
- __如果发现在别处也有类似的例题，请在下面👇评论区告诉小牛__
