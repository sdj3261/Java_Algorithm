import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point> {
    public int x,y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}
public class 좌표정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Point> arr = new ArrayList<>();
        for(int i=0; i<N; i++)
        {
            String[] input = br.readLine().split(" ");
            //x 좌표
            int x = Integer.parseInt(input[0]);
            //y 좌표
            int y = Integer.parseInt(input[1]);

            arr.add(new Point(x,y));
        }

        Collections.sort(arr);

        for(Point p : arr) {
            wr.write(String.format("%s %s\n",p.x, p.y));
        }




        wr.flush();
        wr.close();
        br.close();
    }
}
