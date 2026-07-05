class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int r = 0;
        Set<Character> sub = new HashSet<>();

        for (int l = 0; l < s.length(); l++) {
            while(r < s.length() && !sub.contains(s.charAt(r))) {
                sub.add(s.charAt(r));
                r++;
                ans = Math.max(ans, sub.size());
            } 
            sub.remove(s.charAt(l));
        }
        return ans;
    }
}
