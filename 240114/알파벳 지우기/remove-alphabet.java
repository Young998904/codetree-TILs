import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        String newStr1 = "";
        String newStr2 = "";

        // System.out.println((int) '0'); // 48
        // System.out.println((int) '9'); // 57
        int charNum;

        // 첫번째 문자열
        for (int i=0; i<str1.length(); i++) {
            charNum = (int) str1.charAt(i);
            if (charNum < 58) newStr1 += str1.charAt(i);
        }

        // 두번째 문자열
        for (int i=0; i<str2.length(); i++) {
            charNum = (int) str2.charAt(i);
            if (charNum < 58) newStr2 += str2.charAt(i);
        }

        // System.out.println(newStr1);
        // System.out.println(newStr2);

        System.out.print(Integer.parseInt(newStr1) + Integer.parseInt(newStr2));
    }
}