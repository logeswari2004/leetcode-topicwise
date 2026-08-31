class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int count=0;
        int max=0;
        int prev=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                count++;
            }else if(nums[i]==0){
                prev=count;
                count=0;
            }
            max=Math.max(max,prev+count);
        }
        return max==n?max-1:max;
    }
}