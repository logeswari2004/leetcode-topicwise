class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        int l=0;
        int r=n-1;
        Arrays.sort(nums);
        int c=0;
        while(l<r){
            if(nums[l]+nums[r]==k){
                c++;
                l++;
                r--;
            }else if(nums[l]+nums[r]>k){
                r--;
            }else{
                l++;
            }
        }
        return c;
    }
}