import java.util.ArrayList;
import java.util.Scanner;

class Solution15 {
    public ArrayList<Integer> solution15(int[] num)
    {
        int cnt;
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<num.length; i++)
        {
            cnt = 1;
            for(int j=0; j<num.length; j++)
            {
                if(num[j] > num[i])
                    cnt += 1;
            }
            answer.add(cnt);
        }
        return answer;
    }

}
public class 등수구하기 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int num[] = new int[n];
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<num.length; i++)
        {
            num[i] = in.nextInt();
        }
        Solution15 solution15 = new Solution15();
        answer = solution15.solution15(num);
        for(int a : answer)
        {
            System.out.printf("%d ", a);
        }

    }
}