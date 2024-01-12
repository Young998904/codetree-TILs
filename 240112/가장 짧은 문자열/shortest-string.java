import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        String input;
        for (int i=1; i<=3; i++) {
            input = sc.next();

            min = Math.min(min, input.length());
            max = Math.max(min, input.length());
        }

        System.out.print(max - min);
    }
}