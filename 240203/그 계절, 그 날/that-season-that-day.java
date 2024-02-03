// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String answer = "-1";

//         int y = sc.nextInt();
//         int m = sc.nextInt();
//         int d = sc.nextInt();

//         // System.out.println(y + " " + m + " " + d);

//         if (m == 2) { // 2월 (특수) : 윤년 확인 필요
//             if (isLeap(y)) { // 윤년인 경우
//                 if (d <= 29) answer = "Winter";
//             }
//             else { // 윤년이 아닌 경우
//                 if (d <= 28) answer = "Winter";
//             }
//         }
//         else { // 2월 제외 나머지
//             int maxDay = 0;

//             switch (m) {
//                 case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//                     maxDay = 31;
//                     break;
//                 case 4: case 6: case 9: case 11:
//                     maxDay = 30;
//                     break;
//             }

//             boolean isPossible = true;

//             if (d > maxDay) isPossible = false;

//             // System.out.printf("가능 : %d월\n", m);

//             if(isPossible) {
//                 switch (m) {
//                     case 3: case 4: case 5:
//                         answer = "Spring";
//                         break;
//                     case 6: case 7: case 8:
//                         answer = "Summer";
//                         break;
//                     case 9: case 10: case 11:
//                         answer = "Fall";
//                         break;
//                     case 12: case 1:
//                         answer = "Winter";
//                         break;
//                 }
//             }
//         }

//         System.out.print(answer);
//     }

//     public static boolean isLeap(int y) {
//         if (y %  4 == 0) {
//             if (y % 400 == 0) return true;
//             if (y % 100 == 0) return false;

//             return true;
//         }
//         return false;
//     }
// }

import java.util.Scanner;

public class Main {
    public static boolean isLeapYear(int y) {

        if (y % 4 != 0) return false;

        if (y % 100 != 0) return true;

        if (y % 400 == 0) return true;

        return false;
    }

    public static boolean isExistDay (int y, int m, int d) {
        int[] numOfDays = new int[]{0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        numOfDays[2] = isLeapYear(y) ? 29 : 28; // 2월 확인
        return d <= numOfDays[m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (!isExistDay(y,m,d)) {
            System.out.print("-1");
            return;
        }

        if(3 <= m && m <= 5) {
            System.out.print("Spring");
        }
        else if(6 <= m && m <= 8) {
            System.out.print("Summer");
        }
        else if(9 <= m && m <= 11) {
            System.out.print("Fall");
        }
        else {
            System.out.print("Winter");
        }
    }
}