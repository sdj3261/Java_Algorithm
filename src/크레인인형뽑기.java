import java.io.*;
import java.util.Stack;


public class 크레인인형뽑기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        int[][] num = new int[N][N];
        for (int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                num[i][j] = Integer.parseInt(str[j]);
            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] moves = new int[M];
        String[] move = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            moves[i] = Integer.parseInt(move[i]);
        }

        wr.write(String.valueOf(solution(num, moves)));
        wr.flush();
        wr.close();
        br.close();
    }


    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < moves.length; i++) {
            int item = moves[i];
            for (int j = 0; j < board.length; j++) {
                if(board[j][item-1] != 0) {
                    s.push(board[j][item-1]);
                    board[j][item - 1] = 0;
                    break;
                }
            }
            if(s.size() >= 2) {
                int first = s.pop();
                int second = s.peek();
                if (first == second) {
                    answer += 2;
                    s.pop();
                } else
                    s.push(first);
            }
        }

        return answer;
    }
}
