import java.io.*;

public class 연속부분수열 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] A = br.readLine().split(" ");
        int N = Integer.parseInt(A[0]);
        int M = Integer.parseInt(A[1]);
        String[] arr = br.readLine().split(" ");
        int[] num = new int[N];

        for(int i=0; i<arr.length; i++)
            num[i] = Integer.parseInt(arr[i]);

        int lt = 0, rt = 0;
        int sum = 0, answer = 0;

        for(rt = 0; rt<N; rt++) {
            sum += num[rt];
            if (sum == M) answer++;

            while (sum > M) {
                sum -= num[lt];
                lt++;

                if(sum == M) {
                    answer++;
                    break;
                }
            }
        }

        wr.write(String.valueOf(answer));

        wr.flush();
        wr.close();
        br.close();
    }
}
