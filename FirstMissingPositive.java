https://leetcode.com/problems/first-missing-positive/description/
class Solution {
    public int firstMissingPositive(int[] nums) {
        int t=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==t){
                t++;
            }
        }
        return t;
    }
}
