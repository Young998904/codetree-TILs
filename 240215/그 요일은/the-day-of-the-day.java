import java.util.Scanner;

public class Main {
    public static int[] days = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1, d1, m2, d2;

        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();

        String find = sc.next();
        int plus = 0;

        switch (find) {
            case "Mon" : plus = 0;
                         break;
            case "Tue" : plus = 1;
                         break;
            case "Wed" : plus = 2;
                         break;
            case "Thu" : plus = 3;
                         break;
            case "Fri" : plus = 4;
                         break;
            case "Sat" : plus = 5;
                         break;
            case "Sun" : plus = 6;
                         break;
        }

        int now = d1 + plus; // 첫번째 A 요일 시작 날짜

        int end = 0;
        int cnt = 0;
        for (int i=m1; i<=m2; i++) {
            end = days[i];

            while (now <= end) {
                if (now > d2) break;
                cnt++;
                now += 7;
            }

            now -= end;
        }

        System.out.print(cnt);
    }
}

// 2월
// 5 + 5 = 10 첫번째 토요일
// 10 + 7 = 17 두번째 토요일
// 17 + 7 = 24 세번째 토요일
// 24 + 7 = 31 불가능
// 3월
// 31 - 29 = 2 네번째 토요일
// 2 + 7 = 9 다섯번째 토요일
// 끝