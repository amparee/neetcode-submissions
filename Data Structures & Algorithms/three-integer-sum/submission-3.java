class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int target = 0;
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length ; i++) {
            int l = i + 1;
            int r = nums.length - 1;

            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            while ( l < r ) {
                int currSum = nums[i] + nums[l] + nums[r];

                if(currSum > 0) {
                    r--;
                } else if(currSum < 0) {
                    l++;
                } else if( currSum == target ) {
                    List<Integer> currList = new ArrayList<>();
                    currList.add(nums[i]);
                    currList.add(nums[l]);
                    currList.add(nums[r]);
                    result.add(currList);
                    r--;
                    l++;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                } 
            }
            

        }

        return result;

    }
}
