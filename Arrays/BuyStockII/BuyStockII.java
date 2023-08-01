// The cost of a stock on each day is given in an array. 
// Find the maximum profit that you can make by buying and selling on those days.
//  If the given array of prices is sorted in decreasing order,
//   then profit cannot be earned at all.


// Stock Buy Sell to Maximize Profit using Valley Peak Approach:

public class BuyStockII {

    public static int maxProfitFun(int prices[],int n){

            int maxProfit=0;

            for(int i=1;i<n;i++){
                if(prices[i] > prices[i-1])
                {
                    maxProfit+=prices[i]-prices[i-1];
                }
            }


            return maxProfit;

    }

    public static void main(String[] args) {
        int price[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n = price.length;

        System.out.println(maxProfitFun(price,n));
    }
    
}
