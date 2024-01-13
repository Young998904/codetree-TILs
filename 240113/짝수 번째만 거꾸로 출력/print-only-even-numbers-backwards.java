import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String answer = "";

        for (int i=1; i<str.length(); i+=2) {
            answer = str.charAt(i) + answer;
        }

        System.out.print(answer);
    }
}