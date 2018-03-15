# Some-frequent-LeetCode-problem-in-my-oponion
在LeetCode上的一些题

1. Counting Bits

   题目描述：给定一个非负整数n，求出0~n之间每个数的二进制表示中1的个数。

   限定条件：时间复杂度和空间复杂度都为O(n)

   第一眼看到题目，首先想到的是可以计算每个数字的二进制中1的个数，然后保存在数组里就可以了。但是这样时间复杂度就为**O(n\*sizeof(integer))** ，所以要寻找另一种方法。可以观察一列数字的二进制表示的规律。首先2的幂次方中1的个数肯定是1，那么那些不是2的幂次方的数字呢，数列是连续的，考虑5,6,7这三个数字，5 = 4 + 1、6 = 4 + 2、 7 = 4 + 3，也就是说5,6,7这三个数字的1的个数就是1,2,3这三个数字中1的个数加上4中1的个数（1），类似的9~15中对应着1~7中的1的个数加1，那么思路有了。

   ```java
   public int[] countBits(int num) {    
       int[] result = new int[num + 1];
       int point = 1;
       for(int i = 1; i < num + 1; i++){
           if(i == point * 2){
               result[i] = 1;
               point *= 2;
           }else {
               result[i] = result[i - point] + 1;
           }
       }
       return result;
   }
   ```
   
