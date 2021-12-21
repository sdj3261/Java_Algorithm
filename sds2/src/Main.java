import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++)
        {
            int answer = 0;
            int N = Integer.parseInt(br.readLine());
            String[] op = new String[N];
            //set 만든 카드들은 검색에서 제외
            boolean[] check = new boolean[N];

            //operation input
            for(int j=0; j<N; j++)
            {
                op[j] = br.readLine();
            }
            //sorting 하여 우선 속성이 같은 것부터 찾기
            Arrays.sort(op);

            int[] num = new int[3];
            int[] col = new int[3];
            int[] shp = new int[3];
            int[] sdw = new int[3];

            for(int j=0; j<op.length-2; j++)
            {
                for(int k=i+1; k<op.length-1; j++)
                {
                    for(int m=k+1;m<op.length; m++)
                    {
                        if(num[0] == num[1])

                    }
                }
                num = op[j].charAt(0);

            }
            System.out.printf("#%d %d\n", i+1, answer);
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
