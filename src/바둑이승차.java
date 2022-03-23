import java.io.*;

public class 바둑이승차 {
    static int answer = Integer.MIN_VALUE, c , n;
    public void DFS(int l, int sum, int[] arr) {
        if(sum>c)
            return;
        if(l == n) {
            answer = Math.max(answer, sum);
            System.out.println(answer);
        }
        else {
            DFS(l+1, sum + arr[l], arr);
            DFS(l+1, sum, arr);
        }
    }
    public static void main(String[] args) throws IOException {
        바둑이승차 Main = new 바둑이승차();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        c = Integer.parseInt(input[0]);
        n = Integer.parseInt(input[1]);
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        Main.DFS(0,0,num);
        wr.write(String.valueOf(answer));
        wr.flush();
        wr.close();
        br.close();
    }
}
