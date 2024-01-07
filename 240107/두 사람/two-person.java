import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        String firstMan, secMan;
        int first, second;

        first = Integer.parseInt(st.nextToken());
        firstMan = st.nextToken();

        st = new StringTokenizer(br.readLine());

        second = Integer.parseInt(st.nextToken());
        secMan = st.nextToken();

        if ((first >= 19 && firstMan.equals("M"))||(second >= 19 && secMan.equals("M"))) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}