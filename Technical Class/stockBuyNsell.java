public class stockBuyNsell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int ans = bestTime(prices);
        System.out.println(ans);
    }
    static int bestTime(int[] prices) {
        int minPrice = prices[0];
        int maxPro = 0;
        for (int i = 0; i < prices.length; i++) {
            int cost = prices[i] - minPrice;
            maxPro = Math.max(maxPro, cost);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxPro;
    }
}
