import java.io.*;

public class 섬나라아일랜드 {
    static int N;
    static int[][] board;
    static int answer = 0;
    //8 방향 대각선까지
    static int[] dx = {-1,0,1,0,1,-1,-1,1};
    static int[] dy = {0,1,0,-1,1,1,-1,-1};

    public void DFS(int x, int y) {
        //(x,y) 방문처리
        board[x][y] = 0;
        //8방향 순회
        for(int i=0; i<8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            //육지 발견시 0으로 바꿔버리기 -> 8방향으로 계속 탐색하여 육지를 없앰으로 섬인 개수
            if(nx >= 0 && nx < N && ny >= 0 && ny < N && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx,ny);
            }
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        for(int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            for(int j=0; j<N; j++) {
                board[i][j] = Integer.parseInt(input[j]);
            }
        }

        섬나라아일랜드 main = new 섬나라아일랜드();

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(board[i][j] == 1) {
                    answer++;
                    main.DFS(i,j);
                }
            }
        }

        wr.write(String.valueOf(answer));

        wr.flush();
        wr.close();
        br.close();
    }
}
