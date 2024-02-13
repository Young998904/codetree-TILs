import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.io.*;

class Predict implements Comparable<Predict>{ 
    String y, m, d, day, weather;

    public Predict (String when, String day, String weather) {
        String[] whenArr = when.split("-");
        this.y = whenArr[0];
        this.m = whenArr[1];
        this.d = whenArr[2];

        this.day = day;
        this.weather = weather;
    }

    @Override
    public int compareTo (Predict other) {
        if (!this.y.equals(other.y)) return Integer.parseInt(this.y) - Integer.parseInt(other.y);

        if (!this.m.equals(other.m)) return Integer.parseInt(this.m) - Integer.parseInt(other.m);

        return Integer.parseInt(this.d) - Integer.parseInt(other.d);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        PriorityQueue<Predict> pq = new PriorityQueue<>();

        for (int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());

            Predict predict = new Predict(st.nextToken(),st.nextToken(), st.nextToken());

            pq.add(predict);
        }

        while (!pq.isEmpty()) {
            Predict answer = pq.poll();

            if (answer.weather.equals("Rain")) {
                System.out.printf("%s-%s-%s %s %s", answer.y, answer.m, answer.d, answer.day, answer.weather);
                break;
            }
        }
    }
}