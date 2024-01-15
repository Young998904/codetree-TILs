import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.print(func(Math.min(n,m), Math.max(n,m)));
    }
    public static int func (int a, int b) {
        int answer ;
        for (int i=1; ;i++) {
            if (b * i % a == 0) return b*i;
        }
    }
}