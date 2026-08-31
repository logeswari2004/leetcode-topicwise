class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot = findpivotindex(nums);
        if(nums[pivot]<=target && nums[n-1]>= target){
            return binarysearch(nums,target,pivot,n-1);
        }else{
            return binarysearch(nums,target,0,pivot-1);
        }
    }
    int findpivotindex(int nums[]){
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid = l+(r-l)/2;
            
            if(nums[mid]>nums[r]){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        return l;
    }
    int binarysearch(int nums[],int target,int l,int r){
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
}