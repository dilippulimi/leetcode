import java.util.Arrays;
import java.util.HashSet;

public class FindLongestSpecialSubstring2981 {

    public static void main(String[] args) {
        System.out.println(hammingWeight(2147483645));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }

    public static int maximumLength(String s) {

        return -1;
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        return Arrays.stream(nums).boxed().anyMatch(i->!set.add(i));
    }

    public static int hammingWeight(int n) {
        int count =0;

        while(n>0){
            if(n%2==1){
                count++;
            }
            n=n/2;
        }

        return count;
    }

    
}

