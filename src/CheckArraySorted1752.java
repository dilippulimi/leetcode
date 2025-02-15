public class CheckArraySorted1752 {

    public static void main(String[] args) {
        System.out.println(check(new int[]{1,1,1}));
    }

    public static boolean check(int[] nums) {

        int count=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if (nums[i] > nums[(i + 1)%n]) {
                count++;
            }
        }
       return count==1 || count==0;
    }

    private static boolean canFormSum(String s, int target, int currentSum) {
        if (s.isEmpty()) {
            return currentSum == target;
        }

        for (int i = 1; i <= s.length(); i++) {
            String part = s.substring(0, i);
            int num = Integer.parseInt(part);
            if (canFormSum(s.substring(i), target, currentSum + num)) {
                return true;
            }
        }
        return false;
    }

    // Check if number is punishment number
    private static boolean isPunishmentNumber(int n) {
        int square = n * n;
        return canFormSum(String.valueOf(square), n, 0);
    }

    // Find sum of all punishment numbers from 1 to n
    public static int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (isPunishmentNumber(i)) {
                sum += i * i;
            }
        }
        return sum;
    }
}
