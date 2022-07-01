import java.io.*;
import java.util.ArrayList;

public class 피자배달거리 {
    //N x N 보드맵과 피자맵중 M개 선택
    static int N, M,len, answer = Integer.MAX_VALUE;
    //M개의 피자집 선택되는 조합
    static int[] combi;

    //보드판 중 HOME과 PIZZA의 좌표
    static ArrayList<Point> home,pizza;

    //최소값을 찾기 위한 거리 계산 함수
    public int dist(Point home, Point pizza) {
        return Math.abs(home.x - pizza.x) + Math.abs(home.y-pizza.y);
    }

    private static class Point {
        int x,y;

        Point(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }


    public void DFS(int L, int s) {
        //M개의 조합을 찾았다면
        if(L==M) {
            int sum = 0;
            for(Point h : home) {
                int dis = Integer.MAX_VALUE;
                for(int i : combi) {
                    dis = Math.min(dis, dist(h,pizza.get(i) ));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        }
        else {
            for(int i=s; i<len; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        pizza = new ArrayList<>();
        home = new ArrayList<>();

        피자배달거리 main = new 피자배달거리();

        for(int i=0; i<N; i++) {
            String[] input2 = br.readLine().split(" ");
            for(int j=0; j<N; j++) {
                int tmp = Integer.parseInt(input2[j]);
                if(tmp == 1)
                    home.add(new Point(i,j));
                else if(tmp == 2)
                    pizza.add(new Point(i,j));
            }
        }

        len = pizza.size();
        combi = new int[M];

        main.DFS(0,0);

        wr.write(String.valueOf(answer));

        wr.flush();
        wr.close();
        br.close();
    }
}
