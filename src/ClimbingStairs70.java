public class ClimbingStairs70 {

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs70().climbStairs(10));
    }

    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int a = 1;
        int b = 2;
        for(int i=2;i<n;i++){
            b = a+b;
            a = b-a;
        }
        return b;
    }
}
