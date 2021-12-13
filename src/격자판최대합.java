import java.util.Scanner;

class Solution16 {
    public int solution16(int[][] num)
    {
        int cnt;
        int sum = 0;
        int row_max = 0;
        int column_max = 0;
        int daegak_max = 0 ;

        for(int i=0; i<num.length; i++)
        {
            sum = 0;
            for(int j=0; j<num[i].length; j++)
            {
                sum = sum + num[i][j];
            }
            if(row_max < sum)
            {
                row_max = sum;
            }
        }

        for(int i=0; i<num.length; i++)
        {
            sum = 0;
            for(int j=0; j<num[i].length; j++)
            {
                sum = sum + num[j][i];
            }
            if(column_max < sum)
            {
                column_max = sum;
            }
        }

        int dagak1 = 0;
        int dagak2 = 0;

        for(int i=0; i<num.length; i++)
        {
            dagak1 += num[i][i];
            dagak2 += num[(num.length-1)-i][(num.length-1)-i];
        }
        daegak_max = Math.max(dagak1,dagak2);
        return Math.max(column_max,Math.max(daegak_max,row_max));
    }

}
public class 격자판최대합 {
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
        Solution16 solution16 = new Solution16();
        int answer = solution16.solution16(num);
        System.out.println(answer);

    }
}