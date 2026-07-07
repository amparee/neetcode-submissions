class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        
        for (int p : piles) {
            r = Math.max(p,r);
        }

        int k = r;
        
        while (l <= r) {
            int mid = l + ((r-l) / 2);
            if (mid == 0) mid = 1;
            long timeElapsed = 0;

            for (int p: piles) {
                timeElapsed += (p + mid - 1L) / mid;
            }

            if(timeElapsed <= h) {
                k = mid;
                r = mid - 1;
            } else {
                l = mid + 1;

            }


        }

        return k;
    }
}