import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = 0;

        if (n >= 3000) {
            System.out.println("book");
            return;
        }
        else if (n >= 1000) {
            System.out.println("mask");
            return;
        }
        else {
            System.out.println("no");
        }
    }
}