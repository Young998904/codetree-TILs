import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int starCnt = n;
        boolean minus = true;
        int gap = n-1;

        // 내려가는 과정 
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=starCnt; j++) System.out.print("* ");
            System.out.println();
            if (i == n) break;
            if (minus) starCnt -= gap;
            else starCnt += gap;
            gap--;
            minus = !minus;
        }

        gap++;
        
        // 올라가는 과정
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=starCnt; j++) System.out.print("* ");
            System.out.println();
            if (minus) starCnt -= gap;
            else starCnt += gap;
            gap++;
            minus = !minus;
        }
    }
}