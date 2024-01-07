import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        b = sc.nextInt();
        a = sc.nextInt();

        while (a <= b) {
            System.out.print(b + " ");
            b -= 2;
        }
    }
}