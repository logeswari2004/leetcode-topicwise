class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) return true; // Found target

            // Handle duplicates: skip same elements on both ends
            if (nums[l] == nums[mid] && nums[mid] == nums[r]) {
                l++;
                r--;
                continue;
            }

            // Left half is sorted
            if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) r = mid - 1; // Search left
                else l = mid + 1; // Search right
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[r]) l = mid + 1; // Search right
                else r = mid - 1; // Search left
            }
        }
        return false; // Target not found
    }
}
