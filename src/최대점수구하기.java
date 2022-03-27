import java.io.*;

public class 최대점수구하기 {
    static int m;
    static int n;
    static int answer = Integer.MIN_VALUE;
    public void DFS(int l, int[] score, int[] time, int sum, int t_sum) {
        if(t_sum > m)
            return;
        if(l == n) {
            answer = Math.max(answer, sum);
        }
        else {
            DFS(l+1, score,time, sum + score[l], t_sum + time[l]);
            DFS(l+1, score,time, sum, t_sum);
        }
    }
    public static void main(String[] args) throws IOException {
        최대점수구하기 main = new 최대점수구하기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        int sum = 0;

        int score[] = new int[n];
        int time[] = new int[n];

        for (int i = 0; i < n; i++) {
            String[] num = br.readLine().split(" ");
            int s = Integer.parseInt(num[0]);
            int t = Integer.parseInt(num[1]);

            score[i] = s;
            time[i] = t;
        }
        main.DFS(0,score,time,0, 0);
        wr.write(String.valueOf(answer));
        wr.flush();
        br.close();
        wr.close();
    }

}
