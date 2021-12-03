import java.util.Scanner;

class Solution4 {
    public int solution(String str) {
        int answer = 0;
        StringBuilder num_str = new StringBuilder();
        for(Character chr : str.toCharArray())
        {
            if (Character.isDigit(chr)) {
                num_str.append(chr);
            }
        }
        answer = Integer.parseInt(num_str.toString());
        return answer;
    }
}
public class 숫자만추출 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Solution4 sol = new Solution4();
        System.out.println(sol.solution(input));

    }
}
