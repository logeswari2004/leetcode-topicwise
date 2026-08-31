class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int cor = nums[i]-1;
            if(nums[i] != nums[cor]){
                swap(nums, i, cor);
            }else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(nums[index] != index+1){
                list.add(nums[index]);
            }
        }
        return list;
    }
    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}