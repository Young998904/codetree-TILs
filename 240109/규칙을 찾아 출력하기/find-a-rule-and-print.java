import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 첫줄
        for (int i=1; i<=n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // 나머지
        for (int i=1; i<=n-1; i++) {
            for (int j=1; j<=i; j++) System.out.print("* ");
            for (int j=1; j<=n-1-i; j++) System.out.print("  ");
            System.out.print("* \n");
        }
    }
}