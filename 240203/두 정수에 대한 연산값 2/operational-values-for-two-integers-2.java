import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) { // a가 더 큰 경우
            a = big(a);
            b = small(b);
        }
        else { // b 가 더 큰 경우
            a = small(a);
            b = big(b);
        }

        System.out.print(a + " " + b);
    }

    public static int big (int num) {
        return num * 2;
    }
    public static int small (int num) {
        return num + 10;
    }
}