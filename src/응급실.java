import java.io.*;
import java.util.PriorityQueue;

class Person implements Comparable<Person> {
    int id;
    int priority;

    public Person (int id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    @Override
    public int compareTo(Person o) {
        return o.priority - this.priority;
    }
}

public class 응급실 {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        PriorityQueue<Person> q = new PriorityQueue<>();
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] op = br.readLine().split(" ");
        int N = Integer.parseInt(op[0]);
        int M = Integer.parseInt(op[1]);
        String[] wait = br.readLine().split(" ");
        int[] num = new int[N];
        for(int i=0; i<N; i++) {
            num[i] = Integer.parseInt(wait[i]);
        }

        int d = 0;

        for(int i=0; i<N; i++) {
            q.offer(new Person(i, num[i]));
            if(i == M)
                d = i;
        }

        int count = 1;
        while(!q.isEmpty()) {
            if(q.peek().id == d) {
                answer = count;
                break;
            }
            q.poll();
            count++;
        }
        
        wr.write(String.valueOf(answer));
        System.out.println();
        wr.flush();
        wr.close();
        br.close();
    }
}
