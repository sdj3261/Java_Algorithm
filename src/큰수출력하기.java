import java.util.ArrayList;
import java.util.Scanner;

class Solution8 {
    public ArrayList<Integer> solution(int num, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < num; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}

public class 큰수출력하기 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        Solution8 sol = new Solution8();
        ArrayList<Integer> solution = sol.solution(num,arr);
        for(int i =0;i<solution.size(); i++)
        {
            System.out.print(solution.get(i)+ " ");
        }
    }
}
