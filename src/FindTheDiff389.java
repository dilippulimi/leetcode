public class FindTheDiff389 {

    public static void main(String[] args) {
        System.out.println(findTheDifference("gjkkgtfrdesrtuuiijhgd","gjkkngtfrdesrtuuiijhgd"));
    }

    public static char findTheDifference(String s, String t) {
        final char sXors = (char) s.chars().reduce(0, (a, b) -> a ^ b);
        final char tXors = (char) t.chars().reduce(0, (a, b) -> a ^ b);
        return (char) (sXors ^ tXors);
    }

    // tried with Quick selection technique
    public static char findTheDifferencewithQuick(String s, String t) {

        int slength = s.length()/2;
        System.out.println("s is "+s+ " t is "+t+" "+slength);
        if(s.length()==1) {
            if (s.equals(t.substring(1))) {
                return t.charAt(0);
            } else {
                return t.charAt(1);
            }
        }
        if(!s.substring(0, slength).equals(t.substring(0, slength))){
            if(s.isEmpty()){
                return t.charAt(0);
            }else{
                System.out.println(" first else");
                return findTheDifference(s.substring(0,slength),t.substring(0,slength+1));
            }
        }else{
            if(s.isEmpty()){
                return t.charAt(0);
            }else {
                System.out.println(" final else");
                return findTheDifference(s.substring(slength + 1), t.substring(slength + 1));
            }
        }
    }
}
