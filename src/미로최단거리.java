import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class 미로최단거리 {

    static class Point {
        int x;
        int y;
        public Point(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }

    static Queue<Point> queue = new LinkedList<>();
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] board, dis;
    static int cnt = -1;

    public void BFS(int x, int y) {
        //시작점
        queue.offer(new Point(x,y));
        board[x][y] = 1;

        while(!queue.isEmpty()) {
            Point temp = queue.poll();

            if(temp.x == 7 && temp.y == 7)
                break;

            for(int i=0; i<4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];

                if(nx >=1 && nx <= 7 && ny >=1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[temp.x][temp.y] + 1;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        미로최단거리 main = new 미로최단거리();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        board = new int [8][8]; // 1부터 7까지
        dis = new int [8][8];

        for(int i=1; i<=7; i++) {
            String[] input = br.readLine().split(" ");
            for(int j=1; j<=7; j++) {
                board[i][j] = Integer.parseInt(input[j-1]);
            }
        }

        board[1][1] = 1;
        main.BFS(1,1);
        if(dis[7][7] == 0) {
            wr.write(String.valueOf(-1));
        }
        else
            wr.write(String.valueOf(dis[7][7]));

        wr.flush();
        wr.close();
        br.close();
    }
}
