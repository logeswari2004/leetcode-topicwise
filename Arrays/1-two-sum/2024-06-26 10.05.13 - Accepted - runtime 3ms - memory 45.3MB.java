// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[j] + nums[i] == target) {
//                     return new int[] { i, j };
//                 }
//             }
//         }
       
//    return null;
//     }
// }

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int sol = target - nums[i];
            if(map.containsKey(sol)){
                ans[0] = map.get(sol);
                ans[1] = i;
                break;
            }
            map.put(nums[i],i);
        }
        return new int[]{ans[0],ans[1]};
    }
}