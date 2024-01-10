import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int i=n-1; i>=0; i--) {
            for (int j=0; j<=n; j++) {
                if (j >= i) continue;
                min = Math.min(min, arr[i]-arr[j]);
            }
        }

        System.out.print(min);
    }
}