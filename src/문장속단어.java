import java.util.Arrays;
import java.util.Scanner;

public class 문장속단어 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(solution(input1));
    }
    public static String solution(String str) {
        int maxLength = 0;
        String answer = "";
        String [] word = str.split(" ");
        for (String string : word) {
            if (string.length() > maxLength) {
                maxLength = string.length();
                answer = string;
            }
        }
        return answer;
    }
}
