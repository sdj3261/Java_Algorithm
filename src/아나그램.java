import java.io.*;
import java.util.HashMap;

public class 아나그램 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String word1 = br.readLine();
        String word2 = br.readLine();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character ch : word1.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (Character ch : word2.toCharArray()) {
            map2.put(ch,map2.getOrDefault(ch,0) + 1);
        }

        if (map.equals(map2)) {
            wr.write("YES");
        }
        else
            wr.write("NO");

        wr.flush();
        wr.close();
        br.close();
    }
}
