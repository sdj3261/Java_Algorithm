import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class 송아지찾기 {
    int[] dis = {1,-1,5};
    int answer = 0;
    int[] crd;

    /* BFS 탐색 저장 큐 */
    Queue<Integer> Q = new LinkedList<>();


    /* START값, END값 지정 */
    public int BFS(int s, int e) {
        crd = new int[100001]; // 1번째 배열부터 시작
        crd[s] = 1; // 방문 처리
        Q.offer(s); // 시작 노드 (루트노드 지정) ex) 5...
        int L = 0; // 트리의 레벨 = 정답 몇번을 거쳤는지? 최단거리...
        while (!Q.isEmpty()) { // 큐가 빌때까지 = 즉 도착지에 도달할때 까지
            int len = Q.size(); // 현재 큐에  들어있는 값들 빼내기 위해
            for (int i = 0; i < len; i++) {
                int x = Q.poll(); // 큐 값 하나를 꺼내서
                if(x==e) return L; // 만약 그 값이 도착지값이면 현재 레벨을 리턴
                for (int j = 0; j < 3; j++) { //dis의 배열을 거친 후 다음 목적지 값 계산
                    int nx = x + dis[j];
                    if (nx >= 1 && nx <= 10000 && crd[nx] == 0) { // 유효성 검사
                        crd[nx] = 1; //방문되지 않은 값이면 방문처리
                        Q.offer(nx); //큐에 다음 목적지 삽입
                    }
                }
            }
            for(int t : Q) {
                System.out.print(t + " ");
            }
            System.out.println();
            /* 모든 dis 값을 돌아 다음목적지를 계산했다면 레벨 ++ */
            L++;
        }
        return 1;
    }
    public static void main(String[] args) throws IOException {
        송아지찾기 main = new 송아지찾기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int s = Integer.parseInt(input[0]);
        int e = Integer.parseInt(input[1]);

        wr.write(String.valueOf(main.BFS(s,e)));
        wr.flush();
        wr.close();
        br.close();

    }
}
