import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            List<Integer> answer = new ArrayList<>();
            int sum;

            for (int i=0; i<nums.length-1; i++) {
                sum = 0;
                for(int j=i+1; j<nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        answer.add(i);
                        answer.add(j);
                        break;
                    }
                }
            }
            return answer.stream().mapToInt(i->i).toArray();
        }
    }

    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(Arrays.toString(a.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
