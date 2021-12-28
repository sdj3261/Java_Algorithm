import java.io.*;
import java.util.Collections;
import java.util.TreeSet;

public class k번째큰수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        String[] num_str = br.readLine().split(" ");
        int [] num = new int[num_str.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(num_str[i]);
        }

        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            for (int j=i+1; j< N; j++) {
                for(int k=j+1; k< N; k++) {
                    Tset.add(num[i] + num[j] + num[k]);
                }
            }
        }

        int count = 1;
        for(int x : Tset){
            if(count == K) {
                answer = x;
                break;
            }
            count++;
        }
        wr.write(String.valueOf(answer));
        wr.flush();
        wr.close();
        br.close();
    }
}
