class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        System.out.println(r);
        int ans = r;
        
        while (l <= r) {
            int mid = (r+l) / 2;

            int totalTime = 0;

            for (int pile : piles) {
                totalTime += Math.ceil((double) pile / mid);
            }

            if (totalTime <= h) {
                ans = mid;  
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }   
}
