import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // // 방법 (1) 단순 출력
        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        // for (int i=1; i<=n; i++) {
        //     for (int j=1; j<=n; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // System.out.println();

        // for (int i=1; i<=n; i++) {
        //     for (int j=1; j<=n; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 방법 (2) : BufferedWriter 사용
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.newLine();

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}