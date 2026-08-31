class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        if (len == 1) return 0; // If there's only one element, no jumps are needed
        
        int jumps = 0; // Initialize jump counter
        int currentEnd = 0; // Current end of the current jump
        int farthest = 0; // Farthest index that can be reached
        
        // Traverse the array
        for (int i = 0; i < len - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]); // Update farthest reachable index
            
            // If we reach the end of the current jump
            if (i == currentEnd) {
                jumps++; // Increment jumps
                currentEnd = farthest; // Update end of current jump
                
                // If we can already reach or exceed the last index, break early
                if (currentEnd >= len - 1) {
                    break;
                }
            }
        }
        
        return jumps;
    }
}