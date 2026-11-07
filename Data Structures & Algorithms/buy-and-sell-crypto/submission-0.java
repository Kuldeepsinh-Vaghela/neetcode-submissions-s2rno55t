class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0;
        int j = prices.length - 1;
        while(i < prices.length){
            while(j > i){
                profit = (profit > (prices[j] - prices[i])) ? profit : (prices[j] - prices[i]);
                j --;
            }
            i ++;
            j = prices.length - 1;
            

        }
        return profit;
    }
}
