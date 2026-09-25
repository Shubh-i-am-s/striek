class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        // [7,1,5,3,6,4]
        // FOR MINm
        // i=0
        // 7>7 no
        // 7-7 > 0  no

        // i=1
        // 7>1 no (min becomes 1)
        // 1-7 > 0  no

        // i=2
        // 1>5. no
        // 5-1 > 0 yes ( maxProfit bacomes 4)

        // i=3
        // 1>3. no
        // 3-1 > 4. no

        // i=4
        // 1>6 no
        // 6-1 > 4 yes (maxProfit becomes 5)

        // i=5
        // 1>5. no
        // 5-1 > 5 no

        // therefore maxProfit remains 5

        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            }
        }
        return maxProfit;
    }
}
