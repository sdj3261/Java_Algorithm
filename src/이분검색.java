import java.io.*;
import java.util.Arrays;

public class 이분검색 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        String[] num_str = br.readLine().split(" ");
        int[] num = new int[N];

        for(int i=0; i<N; i++) {
            num[i] = Integer.parseInt(num_str[i]);
        }
        Arrays.sort(num);
        int lt = 0;
        int rt = N-1;
        int answer = 0;

        while(lt<=rt) {
            int mid = (lt+rt) / 2;
            if(num[mid] == M) {
                answer = mid + 1;
                break;
            }
            if(num[mid] > M)
                rt = mid - 1;
            else lt = mid + 1;
            lt++;
        }



        wr.flush();
        wr.close();
        br.close();
    }
}
