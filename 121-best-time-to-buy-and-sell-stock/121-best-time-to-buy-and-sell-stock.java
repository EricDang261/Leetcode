class Solution {
    public int maxProfit(int[] stockPrices) {
        int maxProfit = 0;
        int min = stockPrices[0];
        for(int i = 0; i < stockPrices.length; i++){
            min = min > stockPrices[i] ? stockPrices[i] : min;
            maxProfit = maxProfit < stockPrices[i] - min ?  stockPrices[i] - min : maxProfit;
        }
        return maxProfit;
    }
}