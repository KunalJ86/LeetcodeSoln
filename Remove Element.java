https://leetcode.com/problems/remove-element/
class Solution {
    public int removeElement(int[] nums, int val) {
       int k=0;
       int l=nums.length;
        for(int i=0;i<l;i++)
        {
            if(nums[i]!=val){
                nums[k++]=nums[i];
                
            }
        }
        return k;
    }
}
