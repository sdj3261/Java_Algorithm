import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class 모든아나그램 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String str2 = br.readLine();
        int answer = 0;

        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> answerMap = new HashMap<>();
        for (Character a : str2.toCharArray())
            map.put(a,map.getOrDefault(a,0) + 1);

        int rt = str.length();
        int lt = 0;

        for(int i=0; i<str2.length(); i++)
            answerMap.put(str.charAt(i),answerMap.getOrDefault(str.charAt(i), 0) + 1);
        if(map.equals(answerMap))
            answer += 1;

        for(int i=str2.length(); i<rt; i++) {
            answerMap.put(str.charAt(i),answerMap.getOrDefault(str.charAt(i), 0) + 1);
            if(answerMap.get(str.charAt(lt)) == 1)
                answerMap.remove(str.charAt(lt));
            else {
                answerMap.put(str.charAt(lt), answerMap.get(str.charAt(lt)) - 1);
            }
            lt++;
            if(map.equals(answerMap))
                answer += 1;
        }
        wr.write(String.valueOf(answer));
        wr.flush();
        wr.close();
        br.close();
    }
}
