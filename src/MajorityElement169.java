import com.sun.source.tree.BreakTree;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {

    public static void main(String[] args) {
        int[] arr = new int[]{2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i: nums){
            if(map.get(i)!=null){
                int op = map.get(i)+1;
                if(op>=nums.length/2){
                    return i;
                }
                map.put(i,op);
            }else{
                map.put(i,1);
            }
        }

        return map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey();
    }
}
