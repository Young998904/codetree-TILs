import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.printf("%d\n", a+b+c);
        System.out.printf("%d\n", (a+b+c)/3);
        System.out.printf("%d\n", a+b+c - (a+b+c)/3);
    }
}