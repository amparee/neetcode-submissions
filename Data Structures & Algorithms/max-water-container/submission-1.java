class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int l = 0;
        int r = heights.length - 1;
        while (l < r) {
            int height = Math.min(heights[l], heights[r]);
            int currResult = height * (r-l);
            result = Math.max(currResult, result);

            if(heights[l] < heights[r])
                l++;
             else 
                r--;
        }   
        return result;

    }
}
