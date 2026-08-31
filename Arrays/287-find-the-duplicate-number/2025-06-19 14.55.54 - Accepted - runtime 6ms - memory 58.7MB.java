class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i] != i+1){
                int cor = nums[i]-1;
                if(nums[i] != nums[cor]){
                   swap(nums,i,cor);
                }else{
                return nums[i];
                }
            }else{
                i++;
            }
            
        }
        return -1;
    }
    static void swap(int arr[], int first, int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}