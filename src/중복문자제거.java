import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Solution {
    public String solution(String str) {
        String answer = "";
        StringBuilder strb = new StringBuilder();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(Character chr : str.toCharArray()) {
            map.putIfAbsent(chr, 1);
        }
        Set<Character> KeySet = map.keySet();
        for(Character key : KeySet) {
            strb.append(key);
        }
        return strb.toString();
    }
}
public class 중복문자제거 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Solution sol = new Solution();
        System.out.println(sol.solution(input));

    }
}
