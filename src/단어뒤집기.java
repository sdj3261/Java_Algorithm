import java.util.*;

public class 단어뒤집기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        for(int i =0; i<input1; i++)
        {
            String word = scanner.next();
            System.out.println((solution(word)));
        }
    }
    public static String solution(String str) {
        String answer = "";
        char[] arr = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char character : arr) {
            list.add(character);
        }

        Collections.reverse(list);
        ListIterator<Character> iter = list.listIterator();
        while(iter.hasNext()) {
            answer += iter.next();
        }
        return answer;
    }
}
