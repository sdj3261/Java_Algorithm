import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class 결혼식 {
    static class Time implements Comparable<Time> {
        public int time;
        public char state;
        Time(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time o) {
            if(this.time == o.time)
                return this.state-o.state;
            else
                return this.time-o.time;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Time> arr = new ArrayList<Time>();
        for(int i=0; i<n; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            boolean s = arr.add(new Time(x, 's'));
            arr.add(new Time(y,'e'));
        }
        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        Collections.sort(arr);
        for(Time o : arr) {
            if(o.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer,cnt);
        }
        wr.write(String.valueOf(answer));
        wr.flush();
        wr.close();
        br.close();
    }
}
