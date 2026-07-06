class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[(nums.length*2)];

        
            for(int j = 0; j < ans.length; j++) {
                int i = (j > nums.length-1) ? j - nums.length : j;
                ans[j] = nums[i];
            }
        

        return ans;
    }
}