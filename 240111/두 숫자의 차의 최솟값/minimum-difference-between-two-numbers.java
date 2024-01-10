import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // // 방법(1) : 무식하게 하나하나 해보기
        // int min = Integer.MAX_VALUE;

        // for (int i=n-1; i>=0; i--) {
        //     for (int j=0; j<=n; j++) {
        //         if (j >= i) continue;
        //         min = Math.min(min, arr[i]-arr[j]);
        //     }
        // }

        // System.out.print(min);

        // 방법(2) 생각해서 풀기
        int min = Integer.MAX_VALUE;

        for (int i=1; i<n; i++) {
            min = Math.min(min, arr[i]-arr[i-1]);
        }

        System.out.print(min);
    }
}