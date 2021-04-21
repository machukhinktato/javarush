import java.util.Arrays;

public class Solution {
    public static String[] strings = {"banana", "mama"};

    public static void main(String[] args) {
        Arrays.stream(strings).forEach(
                System.out::println
        );
    }
}
