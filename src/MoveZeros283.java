import java.util.Arrays;

public class MoveZeros283 {

    public static void main(String[] args) {
            moveZeroes(new int[]{0,1,0,3,12});
    }

    public static void moveZeroes(int[] nums) {
        int pos =0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=0){
                nums[pos]=nums[i];
                pos++;
            }
        }
        while(pos<nums.length){
            nums[pos]=0;
            pos++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
