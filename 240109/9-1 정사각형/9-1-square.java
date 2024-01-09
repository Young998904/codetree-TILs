import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 9;

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                System.out.print(num);

                num = num == 1 ? 9 : num-1;
            }
            System.out.println();
        }
    }
}