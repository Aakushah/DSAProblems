// Best Time to Buy and Sell Stock

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.


public class BuyStockI {
    public static void main(String[] args) {

        int prices[]={7,1,5,3,6,4};
        int n=prices.length;

        
        
        int profit=0;

        int max_profit=0;

        int minimum_so_far=prices[0];


        for(int i=0;i<n;i++){
            minimum_so_far=Math.min(minimum_so_far,prices[i]);

            profit=prices[i] - minimum_so_far ;

            if(profit > max_profit){
                max_profit=profit;
            }




        }

        System.out.println(max_profit);


        
    }
    
}
