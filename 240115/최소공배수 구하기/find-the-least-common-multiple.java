import java.util.Scanner;

public class Main {
    // // 방법 (1) : 내풀이
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();
    //     int m = sc.nextInt();

    //     System.out.print(func(Math.min(n,m), Math.max(n,m)));
    // }
    // public static int func (int a, int b) {
    //     int answer ;
    //     for (int i=1; ;i++) {
    //         if (b * i % a == 0) return b*i;
    //     }
    // }

    // 방법 (2) LCM(n,m) = (n * m) / GCD(n,m) 사용
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.print(lcm(n,m));
    }
    public static int lcm (int n, int m) {
        int gcd = 0;
        
        for (int i=Math.min(n,m); i>=1; i--) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
                break;
            }
        }

        return (n * m) / gcd;
    }
}