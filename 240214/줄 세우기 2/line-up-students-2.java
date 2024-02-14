import java.util.*;
import java.io.*;

class Student implements Comparable<Student> {
    int num;
    int len;
    int weight;

    public Student (int len, int weight, int num) {
        this.len = len;
        this.weight = weight;
        this.num = num;
    }

    @Override
    public int compareTo (Student other) {
        if (this.len != other.len) return this.len - other.len;

        return other.weight - this.weight;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        PriorityQueue<Student> pq = new PriorityQueue<>();

        for (int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());

            int len = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            Student student = new Student(len, weight, i);

            pq.add(student);
        }

        while (!pq.isEmpty()) {
            Student student = pq.poll();

            System.out.printf("%d %d %d\n", student.len, student.weight, student.num);
        }
    }
}