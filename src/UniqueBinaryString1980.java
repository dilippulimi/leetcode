import java.util.HashSet;
import java.util.Objects;

public class UniqueBinaryString1980 {

    public static void main(String[] args) {

        String[] arr = new String[]{"111","011","000"};
        System.out.println(findDifferentBinaryString1(arr));
        System.out.println(findDifferentBinaryString(arr));
    }

    public static String findDifferentBinaryString1(String[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int i=0;
        for(String s: nums){
            set.add(Integer.parseInt(s, 2));
        }
        for(int j=0;j<=n+1;j++){
            if(set.add(j)){
                StringBuilder len = new StringBuilder(Integer.toBinaryString(j));

                while(len.length()<n){
                    len.insert(0, "0");
                }
                return len.toString();
            }
        }
        return "s";
    }

    public static String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<nums.length;i++){
            ans.append(nums[i].charAt(i) == '0' ? '1' :'0');
        }
        return ans.toString();
    }
}
