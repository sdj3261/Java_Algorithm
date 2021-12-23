import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class 최대연속부분수열 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] A = br.readLine().split(" ");
        int N = Integer.parseInt(A[0]);
        int K = Integer.parseInt(A[1]);
        String[] arr = br.readLine().split(" ");
        int[] num = new int[N];
        List<Integer> zeroIndex = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
            if (num[i] == 0) zeroIndex.add(i);
        }

        int lt = 0,rt = N;
        int sum = 0;
        int answer = 0;
        int zeroCount = 0;


        for(int i=0; i<zeroIndex.size(); i++)
        {
            num[zeroIndex.get(i)] = 1;
            num[zeroIndex.get(i+1)] = 1;
        }
        for(int i=0; i<rt; i++)
        {
            sum += num[i];
            if(num[i] == 0) {
                zeroCount++;
            }


            if(zeroCount > 3)
        }

        for(int i=0; i<zeroIndex.size(); i++) {
            num[zeroIndex.get(i)] = 1;
        }


        wr.write(String.valueOf(answer));

        wr.flush();
        wr.close();
        br.close();
    }
}
