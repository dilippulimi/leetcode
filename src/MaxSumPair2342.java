import java.util.*;

public class MaxSumPair2342 {

    public static void main(String[] args) {

        System.out.println(sumDigits(123));
        System.out.println(maximumSum(new int[] {229,398,269,317,420,464,491,218,439,153,482,169,411,93,147,50,347,210,251,366,401}));
    }

    public static int maximumSum(int[] nums) {

        int maxsum =0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i: nums){
            int sum = sumDigits(i);
            if(map.containsKey(sum)){
                List<Integer> list = map.get(sum);
                list.add(i);
                map.put(sum,list);
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(sum,list);
            }
        }
        System.out.println(map);
        Optional<Integer> max = map.entrySet().stream().map(Map.Entry::getValue).filter(i -> i.size() >1).map(i ->{
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int num : i) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        int maxSum = max1 + max2;
                return maxSum;})
                .peek(System.out::println).max(Integer::compareTo);

        return max.orElse(-1);

    }

    public static int sumDigits(int n){

        int sum =0;

        while(n>0){
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }
}
