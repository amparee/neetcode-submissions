class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];

        int maxLength = 0;
        int maxFreq = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            count[s.charAt(end) - 'A']++;
            maxFreq = Math.max(maxFreq, count[s.charAt(end)-'A']);

            while ((end-start+1) - maxFreq > k) {
                System.out.println("start: " + start);
                count[s.charAt(start) - 'A']--;
                start++;
            }

            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;        
    }
}
