public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];

            }
            int currentprofit = prices[i]-min;
            if(currentprofit>maxProfit){
                maxProfit = currentprofit;

            }
        }
        return maxProfit;
    
        }
public static void main(String[] args) {
    int[] nums = {7,1,5,3,6,4};
    System.out.println(maxProfit(nums));
}
