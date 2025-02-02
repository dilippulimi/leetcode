public class SpecialArray3151 {

    public static void main(String[] args) {
        System.out.println(isArraySpecial(new int[]{4,3,6}));
    }

    public static boolean isArraySpecial(int[] nums) {

        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i]%2==nums[i+1]%2){
                return false;
            }
        }
        return true;
    }

}
