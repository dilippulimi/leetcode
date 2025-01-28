import java.util.Arrays;

public class CountingBits338 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(10)));
    }

    public static int[] countBits(int n) {

        int[] count = new int[n+1];
        for(int i=1;i<=n;i++){
            count[i] = count[i/2] + (i%2);
        }
        return count;
    }
}
