import java.io.*;


public class 수열추측하기 {
    static int[] b, p, ch;
    int[][] dy = new int[34][34];
    static int n,f;
    boolean flag = false;

    public int combi(int n, int r) {
        if(dy[n][r] > 0)
            return dy[n][r];
        if (n == r || r == 0 )
            return 1;
        else return dy[n][r] = combi(n-1,r-1) + combi(n-1, r);
    }
    public void DFS(int L, int sum) {
        if(flag)
            return;
        if(L == n) {
            if (sum == f) {
                for (int x : p)
                    System.out.print(x + " ");
                flag = true;
            }
        }
        else{
            for(int i=1; i<=n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L+1,sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        수열추측하기 main = new 수열추측하기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        f = Integer.parseInt(input[1]);

        b = new int[n];
        p = new int[n];

        ch = new int[n+1];

        for(int i=0; i<n; i++) {
            b[i] = main.combi(n-1,i);
        }

        for(int x : b) {
            System.out.print(x + " ");
        }
        System.out.println();
        main.DFS(0,0);


        wr.flush();
        wr.close();
        br.close();
    }
}
