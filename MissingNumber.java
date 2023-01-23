https://leetcode.com/problems/missing-number/description/
class Solution {
    public int missingNumber(int[] nums) {
      int f=0;
      Arrays.sort(nums);
      for(int i=0;i<nums.length;i++){
          if(i==nums[i])
          {
              f++;
          }
          else{
              break;
          }
      }
      return f++;
    }
}
