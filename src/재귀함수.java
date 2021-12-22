import java.io.*;

class Main {
    public void DFS(int n) {
        if (n == 1) return;
        else {
            DFS(n/2); // 11 , 5 , 2, 1
            System.out.printf("%d ", n % 2);
        }
    }

    public int Factorial(int n) {
        if(n == 0) return 1;
        else {
            return n * Factorial(n-1);
        }
    }

    static int[] fibo;

    public int Fibo(int n) {

        if (n == 1 || n ==2) return fibo[n] = 1;
        else {
            return fibo[n] = Fibo(n-2) + Fibo(n-1);
        }
    }



    public static void main(String[] args) throws IOException {
        //스택 프레임 매개변수 , 지역변수 , 복귀 정보
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Main T = new Main();
        T.DFS(11);
        System.out.println(T.Factorial(5));
        int n = 10;
        fibo = new int[n+1];
        T.Fibo(n);
        for (int i=1;i<=n; i++)
            System.out.printf("%d ", fibo[i]);
        T.Fibo(n);
        bw.flush();
        br.close();
        bw.close();
    }

}