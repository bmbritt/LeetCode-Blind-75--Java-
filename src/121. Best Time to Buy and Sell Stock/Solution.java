class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int leftPointer = 0;
        int rightPointer = leftPointer + 1;

        while (rightPointer < prices.length) {
            int potentialBuy = prices[leftPointer];
            int potentialSell = prices[rightPointer];

            if (potentialSell <= potentialBuy) {
                leftPointer = rightPointer;
                rightPointer++;
                continue;
            } else {
                int potentialProfit = potentialSell - potentialBuy;
                profit = potentialProfit > profit ? potentialProfit : profit;
                rightPointer++;
            }
        }   
        return profit > 0 ? profit : 0;
    }
}
