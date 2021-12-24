import java.io.*;
import java.util.HashMap;

public class 학급회장 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String vote = br.readLine();
        char answer = '\0';

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char x : vote.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            //System.out.println(x + " " + map.get(x));
            if(map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        wr.write(answer);
        wr.flush();
        wr.close();
        br.close();
    }
}
