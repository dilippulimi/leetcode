public class BackspaceStringCompare844 {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("y#fo##f","y#f#o##f"));
    }

    public static boolean backspaceCompare(String s, String t) {
        return removeBackspace(s).equals(removeBackspace(t));
    }

    public static String removeBackspace(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!sb.isEmpty()) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
        return sb.toString();
    }
}
