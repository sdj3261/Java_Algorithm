import java.io.*;


public class 조합수 {
    int[][] dy = new int[34][34];
    public int DFS(int n, int r) {
        if(dy[n][r] > 0)
            return dy[n][r];
        if (n == r || r == 0 )
            return 1;
        else
            return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    public static void main(String[] args) throws IOException {
        조합수 main = new 조합수();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        wr.write(String.valueOf(main.DFS(a,b)));

        wr.flush();
        wr.close();
        br.close();
    }
}
