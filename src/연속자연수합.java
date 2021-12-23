import java.io.*;

public class 연속자연수합 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        int num = Integer.parseInt(A);
        int m = num / 2 + 1;
        int lt = 0;
        int sum = 0, answer = 0;
        int[] arr = new int[m];

        for(int i=0; i<m; i++) {
            arr[i] = i + 1;
        }

        for(int rt=0; rt<m; rt++) {
            sum += arr[rt];
            if(sum==num)
                answer++;
            while(sum > num) {
                sum -= arr[lt++];
                if(sum==num)
                    answer++;
                }
            }

        wr.write(String.valueOf(answer));

        wr.flush();
        wr.close();
        br.close();
    }
}
