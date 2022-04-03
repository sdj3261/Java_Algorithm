import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class 토마토 {

    static class Point {
        int x;
        int y;
        public Point(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }

    //BFS 를 위한 큐
    static Queue<Point> queue = new LinkedList<>();
    //(-1,0) , (0,1) , (1,0) (0,1) 순회
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] board, dis;
    static int row,col;

    public void BFS() {
        while(!queue.isEmpty()) {
            Point temp = queue.poll();

            for(int i=0; i<4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];

                //가려는 곳이 벽 내 범위 + 익지 않은 토마토일때만
                if(nx >=0 && nx <= row-1 && ny >=0 && ny <= col-1 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[temp.x][temp.y] + 1;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        토마토 main = new 토마토();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        col = Integer.parseInt(input[0]);
        row = Integer.parseInt(input[1]);
        Point[] point = new Point[row * col];
        board = new int [row][col]; //보드판 생성
        dis = new int[row][col]; // 거리 몇번? == 가장 큰값이 정답

        int answer = 0;
        int count = 0;
        int flag = 0;

        for(int i=0; i<row; i++) {
            String[] input2 = br.readLine().split(" ");
            for(int j=0; j<col; j++) {
                int data = Integer.parseInt(input2[j]);
                if(data == 1) {
                    queue.offer(new Point(i,j));
                }
                else if(data == 0) {
                    flag = 1;
                }
                board[i][j] = data;
            }
        }

        //flag 0 : 모든토마토 익음
        // 1 : 정상 모두 익은 최소날짜 출력
        // 2: bfs 이후 보드판에 익지 못한 토마토 존재

        //모두든토마토가 익어있다면
        if(flag == 0) {
            wr.write(String.valueOf(answer));
        }
        // 익지 않은 토마토가 1개라도 있다면
        else {
            //각 1좌표 값 bfs 돌기

            main.BFS();

            //bfs이후 보드판에 익지 못한 토마토가 존재한다면 -1 출력 후 종료

            Loop1 :
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (board[i][j] == 0) {
                        answer = -1;
                        flag = 2;
                        wr.write(String.valueOf(answer));
                        break Loop1;
                    }
                }

            }

            //
            if (flag == 1) {
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++)
                        //현재 값과 이전값 가장 큰값 비교
                        answer = Math.max(answer, dis[i][j]);
                }
                wr.write(String.valueOf(answer));
            }
        }

        wr.flush();
        wr.close();
        br.close();
    }
}

