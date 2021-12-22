import java.util.ArrayList;
import java.util.Scanner;

class Solution20 {
    public ArrayList<Integer> solution20(int[] num, int[] num2) {
        int p1 = 0;
        int p2 = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(p1 < num.length && p2 < num2.length) {
            if (num[p1] < num2[p2])
                arr.add(num[p1++]);
            else
                arr.add(num2[p2++]);
        }

        while(p1 < num.length)
            arr.add(num[p1++]);
        while(p2 < num2.length)
            arr.add(num2[p2++]);

        return arr;
    }
}
public class 두배열합치기 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int num[] = new int[n];
        for(int i=0; i<n; i++)
            num[i] = in.nextInt();
        int m = in.nextInt();
        int num2[] = new int[m];
        for(int i=0; i<m; i++)
            num2[i] = in.nextInt();


        Solution20 solution20 = new Solution20();
        ArrayList<Integer> answer = solution20.solution20(num, num2);
        for(int k : answer)
            System.out.printf("%d ", k);

    }
}