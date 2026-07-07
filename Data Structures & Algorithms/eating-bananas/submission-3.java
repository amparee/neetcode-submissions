class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for(int p: piles) {
            r = Math.max(r,p);
        }

        int res = r;

        while (l <= r) {
            int k = l + (r-l)/2;

            long timeElapsed = 0;

            for(int p : piles) {
                timeElapsed += (int) Math.ceil((double) p/k);
            }

            if (timeElapsed <= h) {
                res = k;
                r = k - 1;
            } else {
                l = k + 1;
            }

        }
        return res;
    }
}
