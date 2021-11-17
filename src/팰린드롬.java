import java.util.Scanner;

class Solution3 {
    public String solution(String str) {
        String answer = "YES";
        StringBuilder palindrom = new StringBuilder();
        char str_arr[] = str.toCharArray();
        for(Character chr : str_arr)
        {
            if(Character.isAlphabetic(chr)) {
                palindrom.append(chr);
            }
        }
        int lt =0, rt = palindrom.toString().length()-1;
        String lower_str = palindrom.toString().toLowerCase();
        char answer_arr[] = lower_str.toCharArray();
        while(lt<rt) {
            if (answer_arr[lt] != answer_arr[rt]) {
                answer = "NO";
                break;
            }
            lt++;
            rt--;
        }
        return answer;
    }
}
public class 팰린드롬 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Solution3 sol = new Solution3();
        System.out.println(sol.solution(input));

    }
}
