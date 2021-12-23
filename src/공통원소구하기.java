import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class 공통원소구하기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" ");
        int[] numA = new int[A.length];

        for(int i=0; i<A.length; i++)
            numA[i] = Integer.parseInt(A[i]);

        int M = Integer.parseInt(br.readLine());
        String[] B = br.readLine().split(" ");
        int[] numB = new int[B.length];

        for(int i=0; i<B.length; i++)
            numB[i] = Integer.parseInt(B[i]);

        Arrays.sort(numA);
        Arrays.sort(numB);

        int idxA = 0;
        int idxB = 0;

        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(idxA < numA.length && idxB < numB.length) {
            if (numA[idxA] < numB[idxB])
                idxA++;
            else if(numA[idxA] > numB[idxB])
                idxB++;
            else {
                arr.add(numA[idxA]);
                idxA++;
                idxB++;
            }

        }

        for(int CommonNum : arr)
            wr.write(String.valueOf(CommonNum) + " ");
        wr.flush();
        wr.close();
        br.close();
    }
}
