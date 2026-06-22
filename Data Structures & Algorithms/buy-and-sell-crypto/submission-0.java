class Solution {
    public int maxProfit(int[] prices) {

        int maxDiff = -1;
        int minValue = prices[0];


        for(int i = 1; i < prices.length; i++ ) {
            if (prices[i] < minValue) {
                minValue = prices[i];
            }
            int currDif = prices[i] - minValue;

            if(currDif > maxDiff) {
                maxDiff = currDif;
            }
        } 

        return (maxDiff > 0) ? maxDiff : 0;
        
    }
}
