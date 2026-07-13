class Solution {

    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = 0;

        if (target <= nums[0]) return 0;
        if (target > nums[nums.length - 1]) return nums.length;

        while (l <= r) {
            int mid = l + (r-l) / 2;

            if (nums[mid] == target) return mid;

            if (nums[mid] < target) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }

        }
        return ans + 1;
    }
}