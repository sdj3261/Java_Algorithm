import java.io.*;
import java.util.Stack;

public class 괄호문자제거 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        Stack<Character> s = new Stack<>();

        for(Character c : str.toCharArray()) {
            if(c == '(') {
                s.push(c);
            }
            else if(c == ')') {
                s.pop();
            }
            else {
                if(s.size() == 0)
                    sb.append(c);
            }
        }

        wr.write(sb.toString());

        wr.flush();
        wr.close();
        br.close();
    }
}
