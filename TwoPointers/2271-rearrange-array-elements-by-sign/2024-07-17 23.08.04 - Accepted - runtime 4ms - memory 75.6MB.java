class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length/2];
        int[] neg=new int[nums.length/2];
        int i=0,j=0;
        for(int x:nums){
            if(x<0){
                neg[j++]=x;
            }
            else{
                pos[i++]=x;
            }
        }
        int k=0;
        i=0;
        while(i<nums.length/2 ){
            nums[k++]=pos[i];
            nums[k++]=neg[i];
            i++;
        }
        return nums;
    }
}