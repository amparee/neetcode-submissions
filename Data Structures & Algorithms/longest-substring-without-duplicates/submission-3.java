class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ml = 0;
        Set<Character> set = new HashSet();
        int r = 0;

        for (int l = 0; l<s.length(); l++) {
            while (r < s.length() && !set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                ml = ml < set.size() ? set.size() : ml; 
                r++;
            }
            set.remove(s.charAt(l));
        }
        return ml;
    }


}
