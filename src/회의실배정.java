import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class 회의실배정 {
    static class Time implements Comparable<Time> {
        public int s, e;
        Time(int s, int e) {
            this.s = s;
            this.e = e;
        }

        @Override
        public int compareTo(Time o) {
            if(this.e == o.e)
                return this.s-o.s;
            else
                return this.e-o.e;
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
            arr.add(new Time(x,y));
        }

        int cnt = 0;
        Collections.sort(arr);
        int et = 0;
        for(Time ob : arr) {
            if(ob.s >= et) {
                cnt++;
                et = ob.e;
            }
        }
        wr.write(String.valueOf(cnt));
        wr.flush();
        wr.close();
        br.close();
    }
}
