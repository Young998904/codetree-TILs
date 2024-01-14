import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String order = sc.next();

        int move = 0;

        for (int i=0; i<order.length(); i++) {
            if (order.charAt(i) == 'L') move--;
            else move++;
        }

        if (move == 0) {
            System.out.print(str);
            return;
        }
        
        if (move < 0) { // "L"
            System.out.print(str.substring(Math.abs(move)) + str.substring(0,Math.abs(move)));
        }
        else { // "R"
            System.out.print(str.substring(str.length() - move) + str.substring(0, str.length() - move));
        }
    }
}