import java.util.Scanner;

class Solution19 {
    public int solution19(int[][] num) {
       int answer = 0;
       int cnt = 0;
       for(int i=1; i<=num[0].length; i++)
       {
           for(int j=1; j<=num[0].length; j++)
           {
               cnt = 0;
               for(int k=0; k<num.length; k++)
               {
                   int pi = 0 ,pj = 0;
                   for(int m=0; m<num[0].length; m++)
                   {
                       if(i==j) continue;
                       if(num[k][m] == i) pi = m;
                       if(num[k][m] == j) pj = m;
                   }
                   if(pi < pj)
                       cnt += 1;
               }
               if(cnt == num.length)
                   answer+=1;
           }
       }
       return answer;
    }
}
public class 멘토링 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int num[][] = new int[m][n];

        for(int i=0;i<m; i++)
        {
            for(int j=0;j<n; j++)
            {
                num[i][j] = in.nextInt();
            }
        }
        Solution19 solution19 = new Solution19();
        int answer = solution19.solution19(num);
        System.out.println(answer);

    }
}