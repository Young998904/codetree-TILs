import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        int sum = 0;
        int cnt = 0;

        while (sc.hasNext()) {
            age = sc.nextInt();

            if (age < 20 || age >= 30) {
                System.out.printf("%.2f", (double) sum / cnt);
                break;
            }

            sum += age;
            cnt++;
        }
    }
}