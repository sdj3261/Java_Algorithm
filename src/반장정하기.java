import java.util.Arrays;
import java.util.Scanner;

class Solution18 {
    public int solution18(int[][] num)
    {
        int answer;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        int [] count = new int[num.length];
        int max = Integer.MIN_VALUE;
        int max_index = 0;
        Arrays.fill(count,0);

        for(int i=0; i<num.length; i++) {
            int cnt = 0;
            for (int j = 0; j < num.length; j++) {
                for (int k = 0; k < 5; k++) {
                    if (num[i][k] == num[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                max_index = i;
            }
        }



        return max_index+1;
    }
}
public class 반장정하기 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int num[][] = new int[n][5];

        for(int i=0;i<n; i++)
        {
            for(int j=0;j<num[i].length; j++)
            {
                num[i][j] = in.nextInt();
            }
        }
        Solution18 solution18 = new Solution18();
        int answer = solution18.solution18(num);
        System.out.println(answer);

    }
}