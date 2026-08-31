class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int minlength = Integer.MAX_VALUE;
        int j=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            while(sum>=target){
                minlength = Math.min(minlength,i-j+1);
                sum = sum-nums[j];
                j++;
            }
        }
        return minlength==Integer.MAX_VALUE?0:minlength;
    }
}