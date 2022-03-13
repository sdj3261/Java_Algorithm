import java.io.*;


public class 카드구매하기2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] dp = new int[N+1];

        for(int i=1; i<=N; i++) {
            dp[i] = Integer.parseInt(str[i-1]);
            for(int j= 1; j<=i/2; j++) {
                dp[i] = Math.min(dp[i], dp[j] + dp[i-j]);
            }
        }

        for(int i : dp) {
            System.out.println(i);
        }
        wr.write(String.valueOf(dp[N]));
        wr.flush();
        wr.close();
        br.close();
    }
}
