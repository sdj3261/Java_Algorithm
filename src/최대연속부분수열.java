import java.io.*;

public class 최대연속부분수열 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] A = br.readLine().split(" ");
        int N = Integer.parseInt(A[0]);
        int K = Integer.parseInt(A[1]);
        String[] arr = br.readLine().split(" ");
        int[] num = new int[N];

        for(int i=0; i<num.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        int lt = 0;
        int zeroCount = 0;
        int answer = 0;
        int max = 0;
        int zeroIndex;


        for(int rt =0; rt<N; rt++) {
            if(num[rt] == 0) zeroCount++;
            while(zeroCount > K) {
                if(num[lt] == 0)
                    zeroCount--;
                lt++;
            }
            answer = Math.max(answer,rt-lt+1);
        }


        wr.write(String.valueOf(answer));

        wr.flush();
        wr.close();
        br.close();
    }
}
