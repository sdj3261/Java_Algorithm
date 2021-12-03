import java.util.Scanner;

class Solution7 {
    public char binary(String tmp) {
        char [] signal = tmp.toCharArray();
        StringBuilder binary_build= new StringBuilder();
        for(Character c : signal)
        {
            if (c=='#') {
                binary_build.append(1);
            }
            else if (c=='*') {
                binary_build.append(0);
            }
        }
        String binary = binary_build.toString();
        int decimal = 0;
        int ex = 0;
        for(int i=binary.length()-1; i>=0; i--)
        {
            decimal += Math.pow(2,ex) * Character.getNumericValue(binary.charAt(i));
            ex += 1;
        }
        return (char)decimal;
    }
    public String solution(int num, String str) {
        String answer = "";
        String tmp = "";
        for(int i =0; i<str.length(); i++)
        {
            tmp += str.charAt(i);
            if (tmp.length() == 7) {
                answer += binary(tmp);
                tmp = "";
            }
        }
        return answer;
    }
}
public class 암호 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String input = in.next();
        Solution7 sol = new Solution7();
        System.out.println(sol.solution(num,input));

    }
}
