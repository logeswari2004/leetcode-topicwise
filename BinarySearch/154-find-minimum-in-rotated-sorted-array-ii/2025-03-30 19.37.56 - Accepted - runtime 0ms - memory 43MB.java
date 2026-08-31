class Solution {
    public int findMin(int[] nums) {
        int rotationcount_with_duplicates = findpivot(nums);
        return rotationcount_with_duplicates;
    }
    int findpivot(int nums[]){
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(nums[mid]>nums[r]){
                l=mid+1;
            }else if(nums[mid] < nums[r]){
                r=mid;
            }else{
                r--;
            }
        }
        return nums[l];
    }
}