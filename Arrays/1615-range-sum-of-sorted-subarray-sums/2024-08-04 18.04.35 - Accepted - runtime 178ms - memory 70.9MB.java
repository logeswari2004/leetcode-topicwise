class Solution {
    private static final int mod=1000000007;
    public int rangeSum(int[] nums, int n, int left, int right) {
       List<Integer> subArrsum=new ArrayList<>();
       for(int i=0;i<n;i++){
        int sum=0;
        for(int j=i;j<n;j++){
            sum += nums[j];
            subArrsum.add(sum);
        }
       }
       Collections.sort(subArrsum);
       int sum=0;
       for(int i=left-1;i<right;i++){
        sum=(sum+subArrsum.get(i))%mod;
       }
       return sum;
    }
}