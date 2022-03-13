import java.io.*;

public class 삽입정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        for (int i = 1; i < N; i++) {
            int tmp = arr[i], j;
            for (j = i-1; j>=0; j--) {
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }
                else
                    break;
            }
            arr[j+1] = tmp;
        }

        for (Integer num : arr) {
            wr.write(String.valueOf(num) + " ");
        }

        wr.flush();
        wr.close();
        br.close();


    }
}
