import java.io.*;
import java.util.Arrays;

public class 뮤직비디오 {

    public int count(int[] arr, int capacity) {
        int cnt = 1; // DVD 장수
        int sum = 0; // DVD 장수 합

        // 1, 2, 3, 4, 5, 6, 7, 8, 9 숫자 배열 순회
        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            }
            else
                sum += x;
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0;
        if(Arrays.stream(arr).max().isPresent())
            lt= Arrays.stream(arr).max().getAsInt(); // DVD의 용량 9부터시작
        int rt = Arrays.stream(arr).sum(); // 45(1~9의 합까지)
        //9~45의 범위를 가지게됨


        //이분검색

        while(lt<=rt) {
            //반으로 자름
            int mid = (lt+rt) / 2; // MID = CAPACITY
            //만약 카운트 개수가 M보다 작다면? RT가 너무크니까 작게 만들어줘야돼
            if(count(arr,mid) <= m) {
                answer = mid;
                rt = mid - 1;
            }
            //만약 카운트 개수가 M보다 크면?
            else lt = mid + 1;
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        뮤직비디오 T = new 뮤직비디오();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int num[] = new int[N];
        String[] num_str = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(num_str[i]);
        }

        wr.write(String.valueOf(T.solution(N,M,num)));

        wr.flush();
        wr.close();
        br.close();
    }
}
