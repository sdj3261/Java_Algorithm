import java.io.*;

public class 아마존인터뷰 {
    static int n, total = 0;
    static String answer = "NO";
    boolean flag = false;

    /* START값, END값 지정 */
    public void DFS(int L, int sum, int[] arr) {
        if(flag) return;
        if(sum > total / 2);
        if(L == n) {
            if((total- sum) == sum) {
                answer = "YES";
                flag = true;
            }
        }
        else {
            DFS(L+1, sum + arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }
    public static void main(String[] args) throws IOException {
        아마존인터뷰 main = new 아마존인터뷰();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        n = Integer.parseInt(input);
        String[] num_str = br.readLine().split(" ");
        int[] num = new int[n];
        for(int i=0; i<n; i++) {
            num[i] = Integer.parseInt(num_str[i]);
            total = total + num[i];
        }

        main.DFS(0,0,num);
        wr.write(answer);
        wr.flush();
        wr.close();
        br.close();

    }
}
