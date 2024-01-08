import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt;

        for (int i=1; ;i++) {
            n /= i;
            if (n <= 1) {
                cnt = i;
                break;
            }
        }

        System.out.println(cnt);
    }
}