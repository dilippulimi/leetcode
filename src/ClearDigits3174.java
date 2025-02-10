import java.util.*;
import java.util.stream.Collectors;

public class ClearDigits3174 {

    public static void main(String[] args) {

        System.out.println(clearDigitswithWorstComplexity("abc"));
    }

    public static String clearDigitswithWorstComplexity(String s) {
        StringBuilder sb = new StringBuilder(s);
        Set<Integer> list = new HashSet<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(Character.isDigit(s.charAt(i))){
                int num = i-1;
                list.add(i);
                while(num>=0 ){
                        if(Character.isAlphabetic(s.charAt(num)) && !list.contains(num)){
                            list.add(num);
                            break;
                        }else{
                            num--;
                        }
                }
            }
        }
        List<Integer> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
        for(Integer in : collect){
                sb.deleteCharAt(in);
        }


        return sb.toString();
    }
}
