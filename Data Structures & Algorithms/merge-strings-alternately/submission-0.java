class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int i;
        int size = Math.min(word1.length(), word2.length());

        for (i=0; i < size; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if(word1.length() == size) {
            sb.append(word2.substring(size));
        } else {
            sb.append(word1.substring(size));
        }

        return sb.toString();

    }
}