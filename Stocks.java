public class Stocks {
        public static int maxProfit(int[] prices) {
            //maxAtRighht {6,6,6,6,4,0}>> profit = max[i] - prices[i]
    
            int n = prices.length;
            int maxAtRight[] = new int[n];
            int curMax = prices[n-1];
           
            for(int i = n-2; i>=0; i--)
            {
                maxAtRight[i] = curMax;
    
                if(prices[i]>curMax){
                    curMax = prices[i];
                }
            }
     
                int profit = 0;
                for(int i=0; i<n-1; i++)
                {
                    int curProfit = maxAtRight[i] - prices[i];
                    if(curProfit > profit){
                        profit= curProfit;
                        
                    }
                }
                return profit;
    
        }

        public static void main(String[] args) {
            int prices[]={7,1,5,3,6,4};

            System.out.println(maxProfit(prices));
        }
    }