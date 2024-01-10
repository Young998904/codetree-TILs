import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int input;
        for (int i=0; i<10; i++) {
            input = sc.nextInt();
            if (input % 3 == 0) {
                System.out.print(arr[i-1]);
                break;
            }
            arr[i] = input;
        }
    }
}