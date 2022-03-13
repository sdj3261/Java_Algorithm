import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class 교육과정설계 {
    public static void main(String[] args) throws IOException {
        Queue<Character> q = new LinkedList<>();
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nClass = br.readLine();
        String time = br.readLine();
        String answer = "YES";

        for(Character c : nClass.toCharArray()) {
            q.offer(c);
        }
        for(Character c : time.toCharArray()) {
            if (c == q.peek()) {
                q.poll();
            }
        }

        if(!q.isEmpty())
            answer = "NO";

        wr.write(answer);
        wr.flush();
        wr.close();
        br.close();
    }
}
