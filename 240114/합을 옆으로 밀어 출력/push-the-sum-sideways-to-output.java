import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        for (int i=1; i<=n; i++) {
            sum += sc.nextInt();
        }

        String answer = String.valueOf(sum);

        System.out.print(answer.substring(1)+answer.substring(0,1));
    }
}