class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            if (nums[l] != val) {
                l++;
            } else {
                if(nums[r]!= val) {
                    nums[l] = nums[r];
                    nums[r] = -1;
                    r--;
                    l++;
                } else {
                    nums [r] = -1;
                    r--;
                }
            }
        }

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) res++;
        }
        return res;
    
    }
}