import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int[][] arr = new int[n][n];

        // 1만 채우기
        for (int i=0; i<n; i++) {
            arr[i][0] = 1; // 세로
            arr[0][i] = 1; // 가로
        }

        // 나머지
        for (int i=1; i<n; i++) {
            for (int j=1; j<n; j++) { 
                arr[i][j] = arr[i][j-1] + arr[i-1][j] + arr[i-1][j-1];
            }
        }

        // 출력
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}