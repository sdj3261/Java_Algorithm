import java.util.Scanner;

public class 특정문자뒤집기 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(solution(input));

    }
    public static String solution(String str)
    {
        String answer;
        char [] temp = str.toCharArray();
        int lt = 0, rt = str.length() - 1; // 0번인덱스 , 마지막 문자의 인덱스
        while(lt<rt) {
            if(!Character.isAlphabetic(temp[lt]))
                lt++;
            else if (!Character.isAlphabetic(temp[rt]))
                rt--;
            else {
                char tmp = temp[lt];
                temp[lt] = temp[rt];
                temp[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(temp);
        return answer;
    }
}
