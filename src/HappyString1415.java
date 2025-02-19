import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class HappyString1415 {

    public static void main(String[] args) {
        System.out.println(getHappyString(3,9));
    }

    public static String getHappyString(int n, int k) {
        Map<Character, String> nextLetters = Map.of('a', "bc", 'b', "ac", 'c', "ab");
        Queue<String> q = new ArrayDeque<>(List.of("a", "b", "c"));

        while (q.peek().length() != n) {
            final String u = q.poll();
            for (final char nextLetter : nextLetters.get(u.charAt(u.length() - 1)).toCharArray())
                q.offer(u + nextLetter);
        }

        if (q.size() < k)
            return "";

        for (int i = 0; i < k - 1; ++i)
            q.poll();
        return q.poll();
    }
}
