class Solution {
     int res = 0;
    public int findTargetSumWays(int[] nums, int S) {
        gettarget(nums,0,0,S);
        return res;
    }
    public void gettarget(int[] nums, int index, int sum, int S) {
        if(index == nums.length) {
            if(sum == S)
                res++;
        } else {
            gettarget(nums, index+1, sum+nums[index], S);
            gettarget(nums, index+1, sum-nums[index], S);
        }
    }
}