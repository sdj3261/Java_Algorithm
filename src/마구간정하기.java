import java.io.*;
import java.util.Arrays;

public class 마구간정하기 {

    public int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }

        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        String[] num_str = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);

        int answer = 0;
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(num_str[i]);
        }

        Arrays.sort(num);
        int lt = 1; // 가장 짧은 말 말 사이의거리
        int rt = num[n - 1]-lt; //1부터9사이의 거리  9-1 가장 큰 길이로 설정

        /*count 유효성 함수 */

        마구간정하기 m = new 마구간정하기();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            System.out.println(String.format("%s " + "%s " + "%s " + "%d",lt,rt,mid, m.count(num,mid)));
            if (m.count(num,mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else
                rt = mid - 1;
        }


        wr.write(String.valueOf(answer));

        wr.flush();
        wr.close();
        br.close();
    }
}
