public class bestTimeToBuy {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int ans = bestbuy(prices);
        System.out.println(ans);
    }

    static int bestbuy(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        for (int i = 0; i < prices.length; i++) {
            int cost = prices[i] - buy;
            maxProfit = Math.max(maxProfit, cost);
            buy = Math.min(buy, prices[i]);
        }
        return maxProfit;
    }
}

// [7, 1, 5, 3, 6, 4]
// maxProfit = 0;
// buy = prices[0] = 7

/******************************************************/

// first iteration
// i = 0; (price = 7)
// cost = 7 - 7 = 0;
// max(0, 0);               maxProfit = 0;
// min(7, 7);               buy = 7;

/******************************************************/

// maxProfit = 0;
// buy = 7
// second iteration 
// i = 1; (price = 1)
// cost = 1 - 7 = -6;
// max(0, -6);             maxProfit = 0;
// min(7, 1)               buy = 1;

/******************************************************/

// maxProfit = 0;
// buy = 1;
// third iteration 
// i = 2; (price = 5)
// cost = 5 - 1 = 4;
// max(0, 4);              maxProfit = 4;
// min(1, 5);              buy = 1;

/******************************************************/

// maxProfit = 4;
// buy = 1;
// fourth iteration
// i = 3; (price = 3)
// cost = 3 - 1 = 2;
// max(4, 2);                 maxProfit = 4;
// min(1, 3);                 buy = 1;

/******************************************************/

// maxProfit = 4;
// buy = 1;
// fifth iteration
// i = 4; (price = 6)
// cost = 6 - 1 = 5;
// max(4, 5);                 maxProfit = 5;
// min(1, 6);                 buy = 1;

/******************************************************/

// maxProfit = 5;
// buy = 1;
// sixth iteration
// i = 5; (price = 4)
// cost = 4 - 1 = 3;
// max(5, 3);                 maxProfit = 5;
// min(1, 4);                 buy = 1;


// prints -> 5 as output