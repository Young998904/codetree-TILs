import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String answer = "-1";

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        // System.out.println(y + " " + m + " " + d);

        if (m == 2) { // 2월 (특수) : 윤년 확인 필요
            if (isLeap(y)) { // 윤년인 경우
                if (d <= 29) answer = "Winter";
            }
            else { // 윤년이 아닌 경우
                if (d <= 28) answer = "Winter";
            }
        }
        else { // 2월 제외 나머지
            int maxDay = 0;

            switch (m) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    maxDay = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    maxDay = 30;
                    break;
            }

            boolean isPossible = true;

            if (d > maxDay) isPossible = false;

            // System.out.printf("가능 : %d월\n", m);

            if(isPossible) {
                switch (m) {
                    case 3: case 4: case 5:
                        answer = "Spring";
                        break;
                    case 6: case 7: case 8:
                        answer = "Summer";
                        break;
                    case 9: case 10: case 11:
                        answer = "Fall";
                        break;
                    case 12: case 1:
                        answer = "Winter";
                        break;
                }
            }
        }

        System.out.print(answer);
    }

    public static boolean isLeap(int y) {
        if (y %  4 == 0) {
            if (y % 400 == 0) return true;
            if (y % 100 == 0) return false;

            return true;
        }
        return false;
    }
}