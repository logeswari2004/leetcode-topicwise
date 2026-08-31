class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }else{
                    break;
                }
            }
        }
        //return nums;
    }
    static void swap(int arr[], int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}