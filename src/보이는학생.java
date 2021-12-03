import java.util.ArrayList;
import java.util.Scanner;

class Solution9 {
    public int solution(int num, int[] arr) {
        int pvHeight = arr[0];
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < num; i++) {
            if (pvHeight < arr[i]) {
                answer.add(arr[i]);
                pvHeight = arr[i];
            }
        }
        return answer.size();
    }
}

public class 보이는학생 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }
        Solution9 sol = new Solution9();
        System.out.println(sol.solution(num,arr));
    }
}
