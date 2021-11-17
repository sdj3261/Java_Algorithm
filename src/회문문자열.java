import java.util.Scanner;

class Solution2 {
    public String solution(String str) {
        String answer = "YES";
        int lt =0, rt = str.length()-1;
        String lower_str = str.toLowerCase();
        char str_arr[] = lower_str.toCharArray();
        while(lt<rt) {
            if (str_arr[lt] != str_arr[rt]) {
                answer = "NO";
                break;
            }
            lt++;
            rt--;
        }
        return answer;
    }
}
public class 회문문자열 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Solution2 sol = new Solution2();
        System.out.println(sol.solution(input));

    }
}
