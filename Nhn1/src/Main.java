import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nk = br.readLine().split(" ");

        int N = Integer.parseInt(nk[0]);
        int K = Integer.parseInt(nk[1]);
        int[] count = new int[21];
        Integer[][] arr = new Integer[N][];
        int answer = 0;

        for (int j = 0; j < N; j++) {
            String[] Frequency = br.readLine().split(" ");
            ArrayList<String> list = new ArrayList<String>();

            for(int i=0; i<Frequency.length; i++)
                if(!list.contains(Frequency[i]))
                    list.add(Frequency[i]);

            arr[j] = new Integer[list.size()];
            for (int f = 0; f < list.size(); f++) {
                arr[j][f] = Integer.parseInt(list.get(f));
            }
        }




        for (int i = 1; i <= 20; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int f = 0; f < arr[j].length; f++) {
                        if (arr[j][f] == i)
                            count[i] += 1;
                }
            }
        }
        for(int a : count)
            System.out.printf("%d ", a);
        Arrays.sort(count);
        System.out.println();

        for(int i = count.length-1; i >= count.length - K; i--) {
            answer += count[i];
        }
        System.out.println(answer);
        bw.flush();
        br.close();
        bw.close();
    }
}