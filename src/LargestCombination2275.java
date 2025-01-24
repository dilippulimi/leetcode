import java.util.Arrays;

public class LargestCombination2275 {

    public static void main(String[] args) {

        int[] arr = {16, 17, 71, 62, 12, 24, 14};
//        System.out.println(16 & 71);
          System.out.println(largestCombination(arr));
    }

    public static int largestCombination(int[] candidates) {
        int j = candidates[0];
        for (int i = 1; i < candidates.length; i++) {
            System.out.println(j & candidates[i]);
        }
        return j;
    }
}