public class AddStrings415 {

    public static void main(String[] args) {
        System.out.println(addStrings("123","123"));
    }

    public static String addStrings(String num1, String num2) {

        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10); // Store last digit
            carry = sum / 10; // Compute new carry

            i--;
            j--;
        }

        return result.reverse().toString();
        }

}
