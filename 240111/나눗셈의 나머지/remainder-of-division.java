import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[b];

        int quotient;
        int remainder;

        while (a >= 1) {
            quotient = a / b;
            remainder = a % b;
            arr[remainder]++;
            a /= b;
        }

        int sum = 0;
        for (int i=0; i<b; i++) {
            sum += arr[i]*arr[i];
        }

        System.out.print(sum);
    }
}