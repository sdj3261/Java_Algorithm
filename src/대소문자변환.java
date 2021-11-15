import java.util.Scanner;

public class 대소문자변환 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        System.out.println(solution(input1));
    }
    public static StringBuilder solution(String str) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i<str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))){
                answer.append(Character.toLowerCase(str.charAt(i)));
            }
            else if (Character.isLowerCase(str.charAt(i))){
                answer.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        return answer;
    }
}
