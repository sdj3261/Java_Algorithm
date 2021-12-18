import java.util.ArrayList;
import java.util.Scanner;

public class branch {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        String[] operations = new String[n];
        for(int i=0;i<n; i++)
        {
            operations[i] = in.nextLine();
        }
        Solution solution = new Solution();
        ArrayList<Integer> answer = solution.solution(operations);
        for(int a : answer)
        {
            System.out.printf("%d ", a);
        }
    }

    private static class Solution {
        public ArrayList<Integer> solution(String[] operations) {

        }
    }
}