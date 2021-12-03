import java.util.Scanner;

class Solution6 {
    public String solution(String str) {
        String answer ="";
        str = str + " ";
        int cnt = 1;
        for (int i=0; i<str.length()-1;i++)
        {
            if (str.charAt(i) == str.charAt(i+1))
            {
                cnt ++;
            }
            else {
                answer += str.charAt(i);
                if(cnt > 1)
                    answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }
}
public class 문자열압축 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Solution6 sol = new Solution6();
        System.out.println(sol.solution(input));

    }
}
