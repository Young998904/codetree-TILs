import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int star = n;
        int space = 0;

        for (int i=1; i<=n; i++) { // n줄
            for (int a=1; a<=star; a++) System.out.print("*");
            for (int b=1; b<=space; b++) System.out.print(" ");
            for (int c=1; c<=space; c++) System.out.print(" ");
            for (int d=1; d<=star; d++) System.out.print("*");
            star--;
            space++;
            System.out.println();
        }        
    }
}