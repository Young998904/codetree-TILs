public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;

        int saveA = a;
        int saveB = b;
        int saveC = c;

        b = saveA;
        c = saveB;
        a = saveC;

        System.out.printf("%d\n%d\n%d", a, b, c);
    }
}