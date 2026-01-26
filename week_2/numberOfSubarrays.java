import java.util.*;

public class numberOfSubarrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        System.out.println(sol.fun(nums));
        
        sc.close();
    }
}

class Solution {
    public long fun(int[] nums) {
        Deque<int[]> stack = new ArrayDeque<>();
        long ans = 0;

        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek()[0] < num) {
                stack.pop();
            }

            if (!stack.isEmpty() && stack.peek()[0] == num) {
                stack.peek()[1]++;
            } else {
                stack.push(new int[]{num, 1});
            }
            
            ans += stack.peek()[1];
        }

        return ans;
    }
}