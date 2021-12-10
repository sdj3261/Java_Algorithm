import java.util.ArrayList;
import java.util.Scanner;

class Solution13 {
    public ArrayList<Integer> reversePrime(int[] input) {
        boolean isPrime;
        int ReverseNum;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            isPrime = true;
            sb.append(input[i]);
            ReverseNum = Integer.parseInt(sb.reverse().toString());
            if (ReverseNum < 2) {
                isPrime = false;
            }
            sb.setLength(0);
            for (int j = 2; j < ReverseNum; j++) {
                if (ReverseNum % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                arr.add(ReverseNum);
        }
        return arr;
    }
}
public class 뒤집은소수 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];
        Solution13 solution13 = new Solution13();
        for(int i=0; i<num.length; i++)
            num[i] = in.nextInt();

        ArrayList<Integer> answer = solution13.reversePrime(num);
        for(int i : answer)
            System.out.printf("%d ", i);
    }
}
