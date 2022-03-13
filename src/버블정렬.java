import java.io.*;

public class 버블정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        for (int i = 0; i < N; i++) {
            for(int j=0; j < N-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        for (Integer num : arr) {
            wr.write(String.valueOf(num) + " ");
        }

        wr.flush();
        wr.close();
        br.close();


    }
}
