class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (0 == nums[i] + nums[j] + nums[k]) {
                        Integer[] ints = new Integer[]{nums[i], nums[j], nums[k]};
                        Arrays.sort(ints);        
                        if(!result.contains(Arrays.asList(ints)))    {
                            result.add(Arrays.asList(ints));
                        }
                    }
                }
            }
        }
        

        return result;
    }
}
