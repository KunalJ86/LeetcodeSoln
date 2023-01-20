https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=0;
        int[] ans=new int[2];
        for(;i<=nums.length;i++)
        {
            for(j=i+1;j<=nums.length-1;j++){
                if(nums[i]+nums[j]==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }
            }
        }
        return ans;
    }
}
