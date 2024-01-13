import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        int cnt = 0;
        for (int i=0; i<str1.length()-1; i++) {
            if (str2.equals(str1.substring(i,i+2))) cnt++;
        }

        System.out.print(cnt);
    }
}