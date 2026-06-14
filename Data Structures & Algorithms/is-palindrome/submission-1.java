class Solution {
    public static boolean isPalindrome(String s) {
        s = sanitize(s);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            System.out.println("Right: " + s.charAt(right) + " left: " + s.charAt(left));
            if (s.charAt(right) != s.charAt(left)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private static String sanitize(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                System.out.println("Sanitize: " + s.charAt(i));
                continue;
            }
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
            }
            result.append(c);

        }
        System.out.println(result);
        s = result.toString();
        return s;
    }
}
