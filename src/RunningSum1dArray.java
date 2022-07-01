import java.util.Arrays;

public class RunningSum1dArray {
    static class Solution {
        public int[] runningSum(int[] nums) {
            int[] result = new int[nums.length];
            int RunningSum = 0;
            for(int i=0; i<nums.length; i++) {
                RunningSum = RunningSum + nums[i];
                result[i] = RunningSum;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        Solution a = new Solution();
        int[] b = {1,1,1,1,1};
        System.out.println(Arrays.toString(a.runningSum(b)));
    }
}
