public class NumberSegmentsString434 {

    public static void main(String[] args) {
        String s = "        ";
        System.out.println(countSegments(s));
    }

    public static int countSegments(String s) {
            if(s.isBlank()){
                return 0;
            }

            s=s.trim();
            while(s.contains("  ")){
                s=s.replace("  "," ");
            }
            return s.split(" ").length;
    }
}
