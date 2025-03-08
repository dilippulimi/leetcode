public class MinimumRecolors2379 {

    public static void main(String[] args) {
        System.out.println(minimumRecolors("WBBWWWWBBWWBBBBWWBBWWBBBWWBBBWWWBWBWW",15));
    }

    public static int minimumRecolors(String blocks, int k) {
        int i = 0;
        int count=0;
        int result = Integer.MAX_VALUE;
        while(i<k){
            if(blocks.charAt(i)=='B'){
                count++;
            }
            i++;
        }
        if(count==k){
            return 0;
        }
        result = k-count;
        while(i<blocks.length()){
            if(blocks.charAt(i-k)=='B'){
                count--;
            }
            if(blocks.charAt(i)=='B'){
                count++;
            }
            if(count==k){
                return 0;
            }else{
                result = Integer.min(result,k-count);
            }
            i++;
        }
        return result;
    }
}
