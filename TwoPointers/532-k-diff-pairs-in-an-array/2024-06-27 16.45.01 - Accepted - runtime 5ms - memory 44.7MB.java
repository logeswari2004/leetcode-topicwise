class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
		int l=0;
		int r=1;
		int count=0;
		while(r<n){
			int diff = nums[r]-nums[l];
			if(diff<k){
				r++;
			}else if(diff>k){
				l++;
			}else{
				count++;
				l++;
				r++;
				while(r<n && nums[r]==nums[r-1]){
					r++;
				}
			}
			if(l==r){
				r++;
			}
		}
		return count;
    }
}