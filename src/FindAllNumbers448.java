import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindAllNumbers448 {

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{1,1}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<=nums.length;i++){
            int res = Arrays.binarySearch(nums,i);
            if(res<0){
                list.add(i);
            }
        }
        return list;

    }
}
