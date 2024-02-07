import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        // 숫자 입력
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<n-1; i++) {
            arr[i+1] = gcm(Math.min(arr[i], arr[i+1]), Math.max(arr[i], arr[i+1]));
        }

        System.out.print(arr[n-1]);
    }
    public static int gcm(int small, int big) {
        // System.out.printf("%d 와 %d 의 최소공배수 : ", small, big);

        int answer = 0;

        for (int i=1; ; i++) {
            if (big * i % small == 0) {
                answer = big * i;
                break;
            }
        }
        // System.out.printf("%d\n", answer);

        return answer;
    }
}