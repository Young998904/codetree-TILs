import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numbers = new String[3];

        numbers = sc.next().split("-");

        System.out.printf("%s-%s-%s", numbers[0], numbers[2], numbers[1]);
    }
}