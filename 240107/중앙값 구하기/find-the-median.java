import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b) {
            if (c > a) System.out.println(a); // b < a < c
            else { // b ? c < a
                if (b > c) System.out.println(b); // c < b < a
                else System.out.println(c); // b < c < a                
            }
        }
        else { // a < b
            if (b < c) System.out.println(b); // a < b < c
            else { // a ? c < b
                if (a < c) System.out.println(c); // a < c < b
                else System.out.println(a); // c < a < b
            }
        }
    }
}