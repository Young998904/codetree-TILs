import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n+1];

        for (int i=1; i<=n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i=1; i<=m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            for (int j=a1; j<= a2; j++) {
                sum += arr[j];
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}