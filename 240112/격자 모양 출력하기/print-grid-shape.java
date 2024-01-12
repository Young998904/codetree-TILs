import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n+1][n+1];

        int a, b;
        for (int i=1; i<=m; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            arr[a][b] = a*b;
        }
        
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}