class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prefix = 1;
        int suffix = 1;

        for (int i = 0; i < nums.length; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }
        System.out.println("n");
        for (int n : res) {
            System.out.println(n);
        }
        System.out.println("n");

        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }
        return res;
    }
}
