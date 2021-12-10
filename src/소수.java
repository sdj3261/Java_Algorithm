import java.util.Scanner;

class Solution12 {
    public int primeNumber(int input)
    {
        int[] prime = new int[input+1];
        int count = 0;
        prime[0] = prime[1] = 0;
        for(int i=2;i<=input; i++)
        {
            prime[i] = i;
        }
        for(int i=2;i<input;i++)
        {
            if(prime[i] == 0) {
                continue;
            }
            for(int j=2*i; j<=input; j+=i)
            {
                prime[j] = 0;
            }
        }
        for(int i=0;i<prime.length; i++)
        {
            if(prime[i] != 0)
                count += 1;
        }
        return count;
    }
}
public class 소수 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Solution12 solution12 = new Solution12();
        System.out.println(solution12.primeNumber(n));

    }
}
