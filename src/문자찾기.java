import java.util.Scanner;
import java.util.*;
public class 문자찾기 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);
        System.out.println((Solution(input1, input2)));
    }
    public static int Solution(String str, char chr) {
        int charCount = 0;
        for (int i =0; i<str.length(); i++) {
            if (str.toLowerCase().charAt(i) == Character.toLowerCase(chr))
                charCount += 1;
        }
        return charCount;
    }

}