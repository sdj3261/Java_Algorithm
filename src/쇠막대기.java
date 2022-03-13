import java.io.*;
import java.util.Stack;


public class 쇠막대기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();
        String op = br.readLine();
        int answer = 0;

        for (int i = 0; i < op.length(); i++) {
            if(op.charAt(i) == '(')
                stack.push('(');
            else{
                stack.pop();
                if(op.charAt(i-1) == '(') {
                    answer += stack.size();
                }
                else answer += 1;
            }
        }

        wr.write(String.valueOf(answer));
        wr.flush();
        wr.close();
        br.close();
    }
}
