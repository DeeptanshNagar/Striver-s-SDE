public class brute {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int ans = maxProfit(prices);
        System.out.println(ans);
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0; // 5
        int mimimumPrice = prices[0]; // 5
        for (int i = 1; i < prices.length; i++) {
            int cost = prices[i] - mimimumPrice;
            maxProfit = Math.max(maxProfit, cost);
            mimimumPrice = Math.min(mimimumPrice, prices[i]);
        }
        return maxProfit;
    }

}
