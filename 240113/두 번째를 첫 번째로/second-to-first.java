import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String first = str.substring(0,1);
        String second = str.substring(1,2);

        str = str.replaceAll(second, first);

        System.out.print(str);
    }
}