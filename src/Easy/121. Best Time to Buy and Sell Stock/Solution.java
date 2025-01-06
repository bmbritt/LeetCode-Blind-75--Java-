class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyDay = 0;
        int sellDay = buyDay + 1;

        while (sellDay < prices.length) {
            int potentialBuy = prices[buyDay];
            int potentialSell = prices[sellDay];

            if (potentialSell <= potentialBuy) {
                buyDay = sellDay;
                sellDay++;
                continue;
            } else {
                int potentialProfit = potentialSell - potentialBuy;
                profit = potentialProfit > profit ? potentialProfit : profit;
                sellDay++;
            }
        }   
        return profit > 0 ? profit : 0;
    }
}
