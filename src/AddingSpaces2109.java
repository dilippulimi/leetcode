public class AddingSpaces2109 {

    public static void main(String[] args) {
        System.out.println(addSpaces("icodeinpython",new int[]{1,5,7,9}));
    }

    public static String addSpaces(String s, int[] spaces) {

        StringBuilder sb = new StringBuilder();

        for(int i =0, j=0;i<s.length();i++){
            System.out.println(i+" "+j);
            if(j<spaces.length && i == spaces[j]){
                sb.append(" ");
                j++;
            }
            sb.append(s.charAt(i));

//        for(int i=s.length()-1,j=spaces.length-1;i>=0;i--){
//            System.out.println(i+" "+j);
//            sb = new StringBuilder(Character.toString(s.charAt(i)) + (sb));
//
//            if(j>=0 && i==spaces[j]){
//                sb = new StringBuilder(" ").append(sb);
//                j--;
//            }
            System.out.println(sb);
        }

        return sb.toString();

    }

}
