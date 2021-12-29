import java.io.*;
import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String answer = "YES";

        Stack<Character> s = new Stack<>();
        for(Character c : str.toCharArray()) {
            if (c == '(')
                s.push(c);
            else if (c == ')') {
                if (s.isEmpty()) {
                    answer = "NO";
                    break;
                }
                s.pop();
            }
        }

        if(answer.equals("NO"))
            wr.write(answer);
        else {
            if(s.isEmpty())
                wr.write("YES");
            else
                wr.write(answer);
        }

        wr.flush();
        wr.close();
        br.close();
    }
}
