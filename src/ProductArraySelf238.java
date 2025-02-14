import java.util.Arrays;

public class ProductArraySelf238 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        result[0]=1;
        for(int i=1;i<nums.length;i++){
            result[i]  = result[i-1]  * nums[i-1];
        }
        int product=1;
        for(int j=nums.length-2;j>=0;j--){
            System.out.println(product + " "+nums[j]);
            product = nums[j+1]* product;
            result[j] = product * result[j];
        }
        return result;
    }
}
