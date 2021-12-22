import java.io.*;

public class DFS {
    static int L;
    static int[] check;
    public void dfs2(int N) {
        if (N==L+1) {
            String tmp ="";
            for(int i=1; i<=L; i++)
            {
                if(check[i] == 1)
                    tmp += (i + " ");
            }
            if(tmp.length() >= 1)
                System.out.println(tmp);
        }
        else {
            check[N] = 1;
            dfs2(N + 1);
            check[N] = 0;
            dfs2(N + 1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        DFS a = new DFS();
        L = N;
        check = new int[L+1];
        a.dfs2(1);
    }
}
