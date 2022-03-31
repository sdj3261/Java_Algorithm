import java.io.*;

public class 미로탐색 {
    static final int size = 8;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] board;
    static int cnt = 0;

    public void DFS(int x, int y) {
        if(x == 7 && y == 7)
            cnt++;
        else {
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                //중복검사 이동할 거리가 맵의 범위 안에 있고
                if(nx>=1 && nx <= 7 && ny>=1 && ny <= 7) {
                    //갈 위치가 아직 방문안한 곳 일때
                    if(board[nx][ny] == 0) {
                        //이동 후 다시 dfs 시작
                        board[nx][ny] = 1;
                        DFS(nx,ny);
                        //함수 호출이 끝난 후 다시 되돌아갈때 0으로 바꿔줌
                        board[nx][ny] = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        미로탐색 main = new 미로탐색();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        board = new int [size][size]; // 1부터 7까지
        for(int i=1; i<=7; i++) {
            String[] input = br.readLine().split(" ");
            for(int j=1; j<=7; j++) {
                board[i][j] = Integer.parseInt(input[j-1]);
            }
        }

        board[1][1] = 1;
        main.DFS(1,1);
        System.out.println();
        wr.write(String.valueOf(cnt));

        wr.flush();
        wr.close();
        br.close();
    }
}
