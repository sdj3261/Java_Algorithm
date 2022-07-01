import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class 아기상어{

    public static int[] dx = {1,0,-1,0};
    public static int[] dy = {0,1,0,-1};
    public static int n,m;
    public static int[][] map;
    public static int[][] dist;
    public static int BS = 2;
    public static int eat = 0;
    public static int count = 0;
    public static int SharkX = 0;
    public static int SharkY = 0;
    public static int minX;
    public static int minY;
    public static int minDist;

    private static class Point {
        private int x;
        private int y;

        public Point(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x,y));

        while(!queue.isEmpty()) {
            Point p = queue.poll();

            for(int i=0; i<4; i++) {
                int ax = p.x + dx[i];
                int ay = p.y + dy[i];
            }
        }
    }
    public static void main(String[] args) throws IOException {
        아기상어 main = new 아기상어();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        int sum = 0;

        int score[] = new int[n];
        int time[] = new int[n];

        for (int i = 0; i < n; i++) {
            String[] num = br.readLine().split(" ");
            int s = Integer.parseInt(num[0]);
            int t = Integer.parseInt(num[1]);

            score[i] = s;
            time[i] = t;
        }
        wr.flush();
        br.close();
        wr.close();
    }

}
