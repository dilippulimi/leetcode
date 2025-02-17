public class FirstUniqueCharacter387 {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }

    public static int firstUniqChar(String s) {
        for(int i=0; i<s.length();i++){
            String c = String.valueOf(s.charAt(i));
            if(s.indexOf(c)==s.lastIndexOf(c)){
                return i;
            }
        }
        return -1;
    }
}
