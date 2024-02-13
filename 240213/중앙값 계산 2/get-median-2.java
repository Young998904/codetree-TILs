import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static ArrayList<Integer> array = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = 0;
        for (int i=0; i<n; i++) {
            num = sc.nextInt();

            array.add(num);

            if (i % 2 == 0) {
                printMid(i);
            }
        }
    }
    public static void printMid(int idx) {
        Collections.sort(array);

        // for (int n : array) {
        //     System.out.print(n + " ");
        // }
        // System.out.println();

        System.out.print(array.get(idx / 2) + " ");
    }
}
// 0개면 idx 0 0/2
// 2개면 idx 1 2/2
// 4개면 idx 2 4/2
// 6개면 idx 3 6/2
// -> idx/2