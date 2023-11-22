import java.util.*;

public class Main {
    public static int n;
    public static int[] dx = new int[]{1, -1, 0, 0};
    public static int[] dy = new int[]{0, 0, -1, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char cDir;
        int dist;
        int dir = 0;
        int x = 0;
        int y = 0;
        
        while (n-- > 0) {
            cDir = sc.next().charAt(0);
            dist = sc.nextInt();

            switch (cDir) {
                case 'E' :
                    dir = 0;
                    break;
                case 'W' :
                    dir = 1;
                    break;
                case 'S' :
                    dir = 2;
                    break;
                case 'N' :
                    dir = 3;
                    break;
            }

            x += dx[dir]*dist;
            y += dy[dir]*dist;
        }

        System.out.printf("%d %d", x, y);
    }
}