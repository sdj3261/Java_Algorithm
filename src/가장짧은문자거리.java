import java.util.Scanner;

class Solution5 {
    public int[] solution(String str, char t) {
        int[] answer = new int[str.length()];
        int p = 1000;
        //왼쪽으로 부터 떨어진 거리
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p += 1;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == t) {
                p = 0;
            } else {
                p += 1;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }
}
public class 가장짧은문자거리 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char c = in.next().charAt(0);
        Solution5 sol = new Solution5();
        for (int x : sol.solution(input,c))
        {
            System.out.print(x + " ");
        }

    }
}
