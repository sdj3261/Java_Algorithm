import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LRU {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter((new OutputStreamWriter(System.out)));

        String[] input = br.readLine().split(" ");
        int S = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        int[] num = new int[N];

        // HashMap 을 통해 캐시에 데이터가 쓰인 시간 체크 1~10 1이 가장 처음.. 오래전에 씌임..나머진 덮어씌움
        // 가장 큰 value의 key를 s개만큼 출력
        HashMap<Integer, Integer> Cache = new HashMap<>();


        String[] nums = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(nums[i]);
            Cache.put(num[i],i);
        }

        /*
        HashMap value에 대한 내림차순 정렬방법
        1. Map의 Keyset에 대한 List 생성
        2. Collections.sort(KeyList, 람다식 compareTo 이용)
        key는 .. TreeMap으로 간단히 정렬 가능!..
        keyList에 대해 key와 Map.get(key)를 통해 출력
        */

        List<Integer> keyList = new ArrayList<>(Cache.keySet());
        int cnt = 0;
        Collections.sort(keyList,(o1,o2) -> (Cache.get(o2).compareTo(Cache.get(o1))));
        for(Integer key : keyList) {
            if(cnt == S)
                break;
            wr.write(String.valueOf(key) + " ");
            cnt++;
        }

        wr.flush();
        wr.close();
        br.close();
    }
}
