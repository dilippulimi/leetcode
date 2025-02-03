import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThirdMaximumNumber414 {

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{2,2,3,1}));
    }
    public static int thirdMax(int[] nums) {
        int first=0,second=0,third=0;
        List<Integer> set =Arrays.stream(nums).boxed().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(set);
        Optional<Integer> i = set.size() > 2 ? set.stream().skip(2).findFirst() : set.stream().findFirst();
        return i.get();

    }
}
