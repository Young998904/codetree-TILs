import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int start = n;
        int end = n;

        boolean even;

        if (n % 2 == 0) even = true;
        else even = false;

        int left;
        for (int i=1; i<=2*n-1; i++) {
            if (even) left = 0;
            else left = 1;

            for (int j=1; j<=2*n-1; j++) {
                if (start<=j && j<=end && j%2==left) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();

            if (i >= n) {
                start++;
                end--;
            }
            else {
                start--;
                end++;
            }
            
            even = !even;
        }
    }
}