import java.util.Scanner;

class Solution14 {
    public int scoreSum(int[] input) {
        int sum = 0;
        int scoreCount = 0;
        for(int i=0; i<input.length; i++)
        {
            if (input[i] == 1)
            {
                sum += input[i] + scoreCount;
                scoreCount +=1;
            }
            else
            {
                scoreCount = 0;
            }
        }
        return sum;
    }
}
public class 점수계산 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        Solution14 solution14 = new Solution14();
        for(int i=0; i<num.length; i++)
            num[i] = in.nextInt();
        System.out.println(solution14.scoreSum(num));

    }
}
