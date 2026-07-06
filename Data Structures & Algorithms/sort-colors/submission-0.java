class Solution {
    public void sortColors(int[] nums) {
        int[] aux = new int[3];
        for(int i = 0; i < nums.length; i++) {
            aux[nums[i]]++;
        }

        int j = 0;
        for (int i = 0; i<nums.length; i++) {
            while(aux[j] == 0) {
                j++;
            }
            nums[i] = j;
            aux[j]--; 
        }
    }
}