import java.io.*;

public class 선택정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        for(int i=0; i< arr.length; i++) {
            int idx = i;
            for (int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[idx])
                    idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        for (Integer num : arr) {
            wr.write(String.valueOf(num) + " ");
        }

        wr.flush();
        wr.close();
        br.close();


    }
}
