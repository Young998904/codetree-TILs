import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 'A' -> 65, 'Z' -> 90
        int cnt = 65;

        for (int i=0; i<n; i++) {
            for (int j=0; j<i; j++) System.out.print("  ");
            if (cnt > 90) cnt = 65;
            for (int k=0; k<n-i; k++) {
                System.out.print((char)cnt + " ");
                cnt++;
            }
            System.out.println();
        }
    }
}