class Solution {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        int longest = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num: set) {
            if(!set.contains(num-1)) {
                //start of sequence
                int startOfSeq = num;
                int currLength = 0;
                while (set.contains(startOfSeq)) {
                    currLength++;
                    startOfSeq++;
                    longest = Math.max(currLength, longest);
                }
            }
        }

        return longest;
    }
}
