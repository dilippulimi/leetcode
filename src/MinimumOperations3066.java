import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumOperations3066 {

    public static void main(String[] args) {
        int[] nums = {999999999,999999999,999999999};

        System.out.println(minOperations(nums,1000000000));
    }

    public static int minOperations(int[] nums, int k) {

        int ans = 0;
        Queue<Long> minHeap = new PriorityQueue<>();

        for (final int num : nums)
            minHeap.add((long) num);

        while (minHeap.size() > 1 && minHeap.peek() < k) {
            final long x = minHeap.poll();
            final long y = minHeap.poll();
            minHeap.add(Math.min(x, y) * 2 + Math.max(x, y));
            ++ans;
        }

        return ans;
    }


}
