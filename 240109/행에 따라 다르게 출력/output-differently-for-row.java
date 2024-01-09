import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int num = 0;
        boolean odd = true;

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if (odd) num += 1;
                else num += 2;
                System.out.print(num + " ");
            }
            System.out.println();
            odd = !odd;
        }
    }
}