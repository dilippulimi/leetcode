import java.util.HashSet;

public class CheckDoubleExists1346 {

    public static void main(String[] args) {

        System.out.println(checkIfExist(new int[]{3,1,7,11,0}));

    }

    public static boolean checkIfExist(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            if(set.contains(2*i) || (i%2==0) && set.contains(i/2)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
