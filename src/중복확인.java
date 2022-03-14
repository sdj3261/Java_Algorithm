import java.io.*;
import java.util.HashMap;

public class 중복확인 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        int answer = 0;
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(input[i]);
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer key : num) {
            map.put(key, map.getOrDefault(key, 0) + 1);
            if(map.get(key) > 1) {
                answer = 1;
                break;
            }
        }



        if(answer == 1) {
            wr.write("D");
        }
        else
            wr.write("U");



        wr.flush();
        br.close();
        wr.close();
    }
}