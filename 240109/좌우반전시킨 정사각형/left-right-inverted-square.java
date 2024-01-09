import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int start;
        int gap = 1;

        for (int i=1; i<=n; i++) {
            start = n * i;
            for (int j=1; j<=n; j++) {
                System.out.print(start + " ");
                start -= gap;
            }
            System.out.println();
            gap++;
        }
    }
}