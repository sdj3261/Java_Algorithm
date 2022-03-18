import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class 장난꾸러기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] height = new int[N];
        String[] height_txt = br.readLine().split(" ");

        for(int i=0; i<N; i++) {
            height[i] = Integer.parseInt(height_txt[i]);
        }

        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = height.clone();
        Arrays.sort(tmp);
        for(int i=0; i<N; i++) {
            if(height[i] != tmp[i])
                answer.add(i+1);
        }

        for(int x : answer) {
            wr.write(x + " ");
        }




        wr.flush();
        wr.close();
        br.close();
    }
}
