import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Solution10 {
    public ArrayList<Character> winner(int[] input1, int[] input2)
    {
        ArrayList<Character> answer = new ArrayList<>();
        // 1 가위 2 바위 3 보
        for(int i=0; i<input1.length; i++)
        {
            if(input1[i] - input2[i] > 1 || input2[i] - input1[i] == 1)
            {
                answer.add('B');
            }
            else if(input1[i] == input2[i])
            {
                answer.add('D');
            }
            else
            {
                answer.add('A');
            }
        }
        return answer;
    }
}
public class 가위바위보 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] input1 = new int[n];
        int[] input2 = new int[n];

        for (int i = 0; i < n; i++)
            input1[i] = in.nextInt();

        for (int i = 0; i < n; i++)
            input2[i] = in.nextInt();
        Solution10 solution = new Solution10();
        ArrayList<Character> arr = new ArrayList<>();
        arr = solution.winner(input1,input2);
        Iterator<Character> it = arr.iterator();
        while(it.hasNext()) {
            char value = it.next();
            System.out.println(value);
        }

    }
}
