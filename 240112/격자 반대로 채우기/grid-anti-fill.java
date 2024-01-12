import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int a = n-1;
        int b = n-1;

        boolean up = true;

        int num = 1;

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                arr[a][b] = num;                
                num++;

                if (j==n) break;

                if(up) a--;
                else a++;
            }
            up = !up;
            b--;
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// (3,3) (2,3) (1,3) (0,3) a=3 (-) / b=3 (그대로)
// (0,2) (1,2) (2,2) (3,2) a=0 (+) / b=2 (그대로)
// (3,1) (2,1) (1,1) (0,1) a=3 (-) / b=1 (그대로)
// (0,0) (1,0) (2,0) (3,0) a=0 (+) / b=0 (그대로)