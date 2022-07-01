import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class 씨름선수 {
    //Body에 대한 정보
    private static class Body implements Comparable<Body> {
        int h,w;

        Body(int h, int w) {
            this.h = h;
            this.w = w;
        }


        //키가 큰순서대로 정렬 음수값 (내림차순)
        @Override
        public int compareTo(Body o) {
            return o.h - this.h;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        ArrayList<Body> arr = new ArrayList<>();

        for(int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            arr.add(new Body(Integer.parseInt(input[0]),Integer.parseInt(input[1])));
        }

        Collections.sort(arr);
        for(Body b : arr) {
            System.out.print(b.h  + " "  + b.w);
        }
        int max = Integer.MIN_VALUE;
        for(Body body : arr) {
            if(body.w > max) {
                max = body.w;
                answer++;
            }
        }

        wr.write(String.valueOf(answer));
        wr.flush();
        wr.close();
        br.close();
    }
}
