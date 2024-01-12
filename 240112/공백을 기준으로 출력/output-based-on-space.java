import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        str1 = str1.replaceAll​(" ", "");
        str2 = str2.replaceAll​(" ", "");

        System.out.print(str1+str2);
    }
}