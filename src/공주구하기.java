import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class 공주구하기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> q = new LinkedList <>();

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int answer = 0;
        for(int i=1; i<=N; i++)
            q.offer(i);
        while(!q.isEmpty()) {
            for(int i=1; i<K; i++) {
                q.offer(q.poll());
            }
            q.poll();
            if(q.size() == 1)
                answer = q.poll();
        }


        wr.write(String.valueOf(answer));
        wr.flush();
        wr.close();
        br.close();
    }
}
