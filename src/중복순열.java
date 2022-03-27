import java.io.*;

public class 중복순열 {
    static int[] pm;
    static int n,m;
    public void DFS(int L) {
        if(L == m) {
            for(int x : pm ) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else {
            for(int i=1; i<=n; i++) {
                pm[L] = i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        중복순열 main = new 중복순열();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        pm = new int[m];

        main.DFS(0);

        wr.flush();
        wr.close();
        br.close();

    }
}
