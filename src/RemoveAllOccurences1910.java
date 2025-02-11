public class RemoveAllOccurences1910 {

    public static void main(String[] args) {
        removeOccurrences("daabcbaabcbc","abc");
    }

    public static String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.indexOf(part)==-1){
            int i = sb.indexOf(part);
            sb.delete(i,i+part.length());
        }
        return sb.toString();
    }
}
