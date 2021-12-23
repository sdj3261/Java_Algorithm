import java.io.*;

public class 최대매출 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        str = br.readLine().split(" ");
        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++)
            arr[i] = Integer.parseInt(str[i]);

        int max = Integer.MIN_VALUE;
        int lt = 0;
        int rt = K-1;
        int sum = 0;
        while(rt < arr.length) {
            sum = 0;
            for(int i=lt; i<=rt; i++)
                sum += arr[i];
            if(max < sum)
                max = sum;
            lt++;
            rt++;
        }

        int answer = 0;
        sum = 0;
        for(int i=0; i<K; i++)
            sum += arr[i];
        answer = sum;
        for(int i=K; i<N; i++)
        {
            sum += (arr[i] - arr[i-K]);
            answer = Math.max(answer, sum);
        }

        wr.write(String.valueOf(max));




        wr.flush();
        wr.close();
        br.close();
    }
}
