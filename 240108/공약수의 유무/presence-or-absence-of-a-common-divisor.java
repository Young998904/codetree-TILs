import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        
        a = sc.nextInt();
        b = sc.nextInt();

        boolean find = false;

        for (int i=a; i<=b; i++) {
            if (1920 % i == 0 && 2880 % i == 0) {
                System.out.println(1);
                find = true;
                break;
            }
        }

        if (!find) {
            System.out.println(0);
        }
    }
}