public class BestTimeBuySell121 {

    public static void main(String[] args) {
        int[] nums = {7,6,4,3,1};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {

        int result=0;
        int min = Integer.MAX_VALUE;

        for(int price : prices){
            if(price<min){
                min = price;
            }else{
                result = Math.max(result,price-min);
            }
        }
        return result;
    }

    public static int maxProfit1(int[] prices) {

        int result =0;
        for(int i=0;i<prices.length;i++){
            for(int j =i+1;j<prices.length;j++){
                if((prices[j]-prices[i])>result){
                    result = prices[j]-prices[i];
                }
            }
        }
        return result==0 ? -1 : result;
    }
}
