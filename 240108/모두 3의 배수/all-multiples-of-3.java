import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean satisfied = true;

        while (sc.hasNext()) {
            if (sc.nextInt() % 3 != 0) {
                satisfied = false;
                break;
            }    
        }

        if (satisfied) System.out.println(1);
        else System.out.println(0);
    }
}