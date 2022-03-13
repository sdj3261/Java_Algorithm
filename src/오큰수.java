import java.io.*;
import java.util.Stack;


public class 오큰수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        String[] arr = br.readLine().split(" ");
        for(int i=0; i<N;i++) {
            num[i] = Integer.parseInt(arr[i]);
        }

        for(int i=0; i<N; i++) {
            while(!stack.isEmpty() && num[stack.peek()] < num[i]) {
                num[stack.pop()] = num[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            num[stack.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< N; i++) {
            sb.append(num[i]).append(' ');
        }

        wr.write(sb.toString());
        wr.flush();
        wr.close();
        br.close();
    }
}
