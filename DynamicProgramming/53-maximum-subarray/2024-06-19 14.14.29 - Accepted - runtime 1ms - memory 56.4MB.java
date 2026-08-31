class Solution {
    public int maxSubArray(int[] nums) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int temp = cursum + nums[i];
            if(temp<nums[i]){
                cursum = nums[i];
            }else{
                cursum = temp;
            }
            if(maxsum<cursum){
                maxsum = cursum;
            }
        }
        return maxsum;
    }
}