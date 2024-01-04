import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // // 방법 (1) String.split("<구분자>") 활용
        // Scanner sc = new Scanner(System.in);

        // String[] numbers = new String[3];

        // numbers = sc.next().split("-");

        // System.out.printf("%s-%s-%s", numbers[0], numbers[2], numbers[1]);

        // 방법 (2) Scanner.useDelimiter("<구분자>") 활용
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        String a, b, c;
        a = sc.next();
        b = sc.next();
        c = sc.next();

        System.out.printf("%s-%s-%s", a, c, b);
    }
}