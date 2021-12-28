import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 매출액종류 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int K = Integer.parseInt(line[1]);
        String[] num = br.readLine().split(" ");
        int[] arr = new int[num.length];
        List<Integer> answer = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(num[i]);

        int lt = 0;

        for(int rt=0;rt<N; rt++) {
            map.put(arr[rt],map.getOrDefault(arr[rt], 0) + 1);

            if(rt-lt+1 > K) {
                if(map.get(arr[lt]) == 1)
                    map.remove(arr[lt]);
                else
                    map.put(arr[lt], map.get(arr[lt]) - 1);
                lt++;
            }

            if(rt >= K-1)
                answer.add(map.keySet().size());
        }

        for (Integer integer : answer) {
            wr.write(String.valueOf(integer));
            wr.write(" ");
        }
        wr.flush();
        wr.close();
        br.close();
    }
}
