import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // 방법 (1) 처음부터 double 로 받기
        // double a, b;
        
        // a = sc.nextDouble();
        // b = sc.nextDouble(); 

        // System.out.printf("%.2f", (a+b) / (a-b));

        // 방법 (2) 처음에는 int 로 받고 나중에 double 로 형변환
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.printf("%.2f", (double) (a+b) / (a-b));
    }
}