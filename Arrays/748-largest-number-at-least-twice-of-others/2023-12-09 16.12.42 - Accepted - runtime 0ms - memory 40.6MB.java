class Solution {
    public int dominantIndex(int[] nums) {
        int max=0,i;
        for(i=0;i<nums.length;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        for(i=0;i<nums.length;i++){
            if(max!=i && nums[max]<2*nums[i])
                return -1;
        }
        return max;
    }
}