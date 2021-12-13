import java.util.Scanner;

class Solution17 {
    public int solution17(int[][] num)
    {
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        int count = 0;
        for(int i=0;i<num.length; i++)
        {
            for(int j=0;j<num[i].length; j++)
            {
                boolean flag = true;
                for(int k=0;k<4;k++)
                {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx >= 0 && nx < num.length && ny >= 0 && ny < num.length && num[nx][ny] >= num[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                }
            }
        }
        return count;
    }
}
public class 봉우리 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int num[][] = new int[n][n];

        for(int i=0;i<num.length; i++)
        {
            for(int j=0;j<num[i].length; j++)
            {
                num[i][j] = in.nextInt();
            }
        }
        Solution17 solution17 = new Solution17();
        int answer = solution17.solution17(num);
        System.out.println(answer);

    }
}