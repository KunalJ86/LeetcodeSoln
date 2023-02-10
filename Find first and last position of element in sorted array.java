https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                ans[0]=i;
                while(i<n){
                    if(nums[i]==target)
                        ans[1]=i;
                    i++;
                }
            }
        }
        return ans;
    }
}
