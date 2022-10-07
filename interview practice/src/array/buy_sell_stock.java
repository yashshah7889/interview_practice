package array;

public class buy_sell_stock {
    public int maxProfit(int[] prices) {
        int b=0,s=1;
          int max_profit=0;
          while(s<prices.length){
              if(prices[b]<prices[s]){
                  if(max_profit<prices[s]-prices[b]){
                      max_profit=prices[s]-prices[b];
                  }
              }
                  else{
                      b=s;
                  }
                  s++;
      }
          return max_profit ;
      }
}
