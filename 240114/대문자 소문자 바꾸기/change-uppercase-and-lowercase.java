import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println((int)'A'); // 97
        // System.out.println((int)'Z'); // 122
        // System.out.println((int)'a'); // 65
        // System.out.println((int)'z'); // 90
        
        String str = sc.next();
        int[] newStr = new int[str.length()];

        int charNum;

        for (int i=0; i<str.length(); i++) {
            charNum = (int) str.charAt(i);

            if (charNum >= 65 && charNum <= 90) {
                newStr[i] = charNum + 32;
            }
            else {
                newStr[i] = charNum -32;
            }
        }

        for (int n : newStr) {
            System.out.print((char)n);
        }
    }
}