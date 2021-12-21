import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        // input 받기
        for(int i=0; i<T; i++)
        {
            long answer = 0;
            int N = Integer.parseInt(br.readLine());
            int[] num = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());

            //숫자카드 저장
            for(int j=0; j<N; j++)
            {
                num[j] = Integer.parseInt(st.nextToken());
            }

            //오름차순 정렬
            Arrays.sort(num);

            //사용된 카드인지 아닌지 체크 배열 생성 및 초기화
            boolean[] check= new boolean [num.length];
            Arrays.fill(check,false);
            //최대값
            int max;
            int min;

            //1. 최대한 두 합이 짝수가 되게 만들어 (최대값 + 나머지 == 짝수 만들기) 최대값 선택 가능
            //2. 최대값과 짝수로 만들 카드가 없다면 가장 작은 값 2개를 뽑아 상대방의 이익 감소시키기

            //짝수를 만들 수 있는 경우
            for(int j=num.length-1; j>=0; j--) {
                if(check[j])
                    continue;
                else{
                    max = num[j];
                }
                for (int k = 0; k < j; k++) {

                    //이미 사용한 카드인 경우 패스
                    if(check[k])
                        continue;

                    //사용하지 않은 카드 중 합이 짝수인 경우
                    if((max + num[k]) % 2 == 0) {
                        answer += max;
                        check[j] = true;
                        check[k] = true;
                        break;
                    }
                }
            }

            //체크가 false인 것 중 가장 작은 값 두개 선택
           for(int j=0; j<num.length; j++)
            {
                if(check[j])
                    continue;
                else
                    min= num[j];

                for(int k=j+1; k<num.length; k++)
                {
                    if(!check[k])
                    {
                        answer += min;
                        check[k] = true;
                    }
                }
            }
            System.out.printf("#%d %d\n", i+1, answer);
        }
        bw.flush();
        br.close();
        bw.close();
    }
}