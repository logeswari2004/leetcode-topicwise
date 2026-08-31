class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);
        int sum = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            int r = sum % k;
            if(r<0){
                r += k;
            }
            if(hash.containsKey(r)){
                count += hash.get(r);
                hash.put(r,hash.get(r)+1);
            }else{
                hash.put(r,1);
            }
        }
        return count;
    }
}