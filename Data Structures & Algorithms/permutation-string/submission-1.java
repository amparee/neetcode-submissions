class Solution {
    public static boolean checkInclusion(String s1, String s2) {
        System.out.println("Empieza el for");
        char[] chars = s1.toCharArray();
        int[] s1Map = new int[26];
        for(char c : chars) {
            s1Map[c - 'a']++;
        }

        for (int i : s1Map) {
            System.out.print(i);
        }

        System.out.println();

        int left;
        int s1Length = s1.length();
        int diff = s2.length() - s1.length();


        System.out.println(" " + s2.length() + " " + diff);

        for(left = 0; left <= diff; left ++) {
            System.out.println("entro al segundo");
            String substring = s2.substring( left, left + s1Length);
            System.out.println(substring);

            char[] substringChars = substring.toCharArray();

            int[] s2Map = new int[26];
            for(char c : substringChars) {
                s2Map[c - 'a']++;
            }

            for (int i : s2Map) {
                System.out.print(i);
            }
            System.out.println();

            if(Arrays.equals(s1Map, s2Map)) {
                return true;
            }


        }

        return false;
    }
}
