public class ExcelSheetColumn168 {

    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();

        int rem =0;

        while(columnNumber>0){
            rem = (columnNumber-1)%26;
            sb.append((char) ('A'+rem));
            columnNumber = (columnNumber-1)/26;
            System.out.println(sb+" "+columnNumber);
        }



//        while(columnNumber>26){
//            rem = columnNumber%26;
//            System.out.println(rem+" "+columnNumber);
//            if(rem==0){
//                sb.append('A');
//            }else{
//                sb.append((char) ('A'+rem));
//            }
//            columnNumber= columnNumber/26;
//        }
//        sb.append((char) ('A'+columnNumber-1));
        return sb.reverse().toString();
    }
}
