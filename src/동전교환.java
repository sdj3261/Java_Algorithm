import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class 동전교환 {
    static int n;
    static int m;
    static int answer = Integer.MAX_VALUE;
    static HashMap<Integer, Integer> map;

    private void DFS(int L, Integer[] coin, int sum) {
        if(sum > m)
            return;
        if(L >= answer) return;
        if(sum == m) {
            answer = Math.min(answer, L);
        }
        else {
            for(int i=0; i<n; i++) {
                DFS(L+1, coin, coin[i] + sum);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        Integer[] coin = new Integer[n];
        for(int i=0; i<n; i++) {
            coin[i] = Integer.parseInt(input[i]);
        }
        m = Integer.parseInt(br.readLine());

        Arrays.sort(coin, Collections.reverseOrder());

        map = new HashMap<>();
        int[] coins = new int[n];

        동전교환 main = new 동전교환();

        main.DFS(0,coin, 0);
        System.out.println(answer);

        br.close();
    }
}
