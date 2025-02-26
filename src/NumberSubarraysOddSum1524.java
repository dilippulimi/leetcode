import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class NumberSubarraysOddSum1524 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(numOfSubarrays(arr));
        int[] nums ={1,-3,2,3,-4};
        System.out.println(maxAbsoluteSum(nums));
    }

    public static int numOfSubarrays(int[] arr) {
        int oddCount = 0, evenCount = 1; // Empty prefix sum is considered even
        int prefixSum = 0, result = 0;
        int MOD = 1000000007;

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum % 2 == 0) {
                result = (result + oddCount) % MOD;
                evenCount++;
            } else {
                result = (result + evenCount) % MOD;
                oddCount++;
            }
        }

        return result;
    }

    public static int maxAbsoluteSum(int[] nums) {
        int sum = 0;
        int maxPrefix = 0;
        int minPrefix = 0;

        for (final int num : nums) {
            sum += num;
            maxPrefix = Math.max(maxPrefix, sum);
            minPrefix = Math.min(minPrefix, sum);
        }

        return maxPrefix - minPrefix;
    }
}
