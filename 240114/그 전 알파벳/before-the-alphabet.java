import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int input = (int) sc.next().charAt(0);

        if (input == (int) 'a') System.out.print('z');
        else System.out.print((char) (input-1));
    }
}