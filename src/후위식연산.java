import java.io.*;
import java.util.Stack;


public class 후위식연산 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        String postfix = br.readLine();
        Stack<Integer> s = new Stack<>();
        for(Character ch : postfix.toCharArray())
        {
            int sum;
            if(Character.isDigit(ch))
                s.push(Character.getNumericValue(ch));
            else if(ch == '+') {
                sum = s.pop() + s.pop();
                s.push(sum);
            }
            else if(ch == '-') {
                int first = s.pop();
                int second = s.pop();
                sum = second - first;
                s.push(sum);
            }
            else if(ch =='*') {
                sum = s.pop() * s.pop();
                s.push(sum);
            }
            else if(ch == '/') {
                int first = s.pop();
                int second = s.pop();
                sum = second / first;
                s.push(sum);
            }
        }
        answer = s.pop();

        wr.write(String.valueOf(answer));
        wr.flush();
        wr.close();
        br.close();
    }
}
