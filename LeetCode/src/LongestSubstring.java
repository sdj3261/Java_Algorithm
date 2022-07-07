

public class LongestSubstring {
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            int s_idx = 0;
            int e_idx = 1;
            int maxLength = 1;

            while(true) {
                String temp = s.substring(s_idx,e_idx);
                char[] check = temp.toCharArray();
                for(int i=0; i<temp.length(); i++) {
                }

                if(e_idx == s.length())
                    break;
            }
        }
    }


    public static void main(String[] args) {
        Solution a = new Solution();
        String s = "abcabcbb";
        System.out.println(a.lengthOfLongestSubstring(s));
    }
}
