import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class 최대수입스케줄 {
    static class Lecture implements Comparable<Lecture> {
        public int money, time;
        Lecture(int money, int time) {
            this.money = money;
            this.time = time;
        }
        @Override
        public int compareTo(Lecture o) {
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.MIN_VALUE;
        int n = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Lecture> arr = new ArrayList<>();
        Collections.sort(arr);

        int j = 0;
        for(int i = max; i>=1; i--) {
            for(; j<n; j++) {
                if(arr.get(j).time<i)
                    break;
                pQ.offer(arr.get(j).money);
            }
        }

        wr.flush();
        wr.close();
        br.close();
    }
}
