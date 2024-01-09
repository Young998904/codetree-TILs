import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int prodNum = 2;

        for (int i=2; i<=8; i+=2) {
            for (int j=b; j>=a; j--) {
                System.out.printf("%d * %d = %d", j, i, j*i);
                if (j == a) break;
                System.out.print(" / ");
            }
            System.out.println();
        }
    }
}