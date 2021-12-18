import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] op = new String[N];
        int flag = 0;
        int id = 1;
        boolean[] check = new boolean[N+1];
        check[id] = true;


        for (int i = 0; i < N; i++) {
            op[i] = br.readLine();
        }

        for(int i=0; i<op.length; i++)
        {
            if(op[i].contains("branch"))
            {
                for(int j=1;j<=N; j++)
                {
                    if(!check[j]) {
                        check[j] = true;
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0) {
                    check[++id] = true;
                }
            }
            else
            {
                StringTokenizer st = new StringTokenizer(op[i]);
                String[] merge = new String[2];
                int j = 0;
                while(st.hasMoreTokens()){
                    merge[j] = st.nextToken();
                    j++;
                }
                int merge_num = Integer.parseInt(merge[1]);
                check[merge_num] = false;
            }
        }

        for (int i = 1; i <= N; i++) {
            if(check[i] == true)
                bw.write(i + " ");
        }
        bw.flush();

        br.close();
        bw.close();
    }
}