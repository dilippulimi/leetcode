public class AddDigits258 {

    public static void main(String[] args) {
        System.out.println(addDigits(0));
    }

    public static int addDigits(int num){
        int sum =0;
        if(num/10==0){
            return num;
        }else{
            while(num>0){
                sum +=num%10;
                num = num/10;
            }
            return addDigits(sum);
        }
    }
}
