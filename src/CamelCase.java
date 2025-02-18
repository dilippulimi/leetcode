public class CamelCase {

    public static void main(String[] args) {

        String str = "getCurrencyCode";

        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(sb.isEmpty() && Character.isLowerCase(ch) ){
                continue;
            }
            if(Character.isUpperCase(ch)){
                if(sb.isEmpty()){
                    sb.append(ch);
                }else{
                    sb.append("_");
                    sb.append(ch);
                }
            }else{
                sb.append(ch);
            }

        }
        System.out.println(sb);
    }


}
