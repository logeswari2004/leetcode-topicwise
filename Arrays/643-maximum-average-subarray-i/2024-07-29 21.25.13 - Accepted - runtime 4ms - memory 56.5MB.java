class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double max=sum/(double)k;
        int j=k;
        while(j<nums.length){
            
            sum=sum-nums[j-k]+nums[j];
            double avg=sum/(double)k;
            max=Math.max(max,avg);
            j++;
        }
        return max;
    }
}