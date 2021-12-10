import java.util.Scanner;

class Solution11 {
    public void solution11(int num)
    {
        int sum = 0;
        int a = 1;
        int b = 1;
        for (int i = 1; i <= num; i++) {
            if (i == 1 || i == 2) {
                System.out.printf("%d ", a);
            }
            else{
                sum = a+b;
                System.out.printf("%d ", sum);
                b = a;
                a = sum;
            }
        }
    }
}
public class 피보나치수열 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Solution11 solution = new Solution11();
        solution.solution11(n);
    }
}
