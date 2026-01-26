import java.util.*;

public class subarra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Standard check for input
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        Solution sol = new Solution();
        System.out.println(sol.findLengthOfShortestSubarray(arr));
        
        sc.close();
    }
}

class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;

        // 1. Find the non-decreasing prefix
        int left = 0;
        while (left + 1 < n && arr[left] <= arr[left + 1]) {
            left++;
        }

        // If array is already sorted
        if (left == n - 1) return 0;

        // 2. Find the non-decreasing suffix
        int right = n - 1;
        while (right > 0 && arr[right - 1] <= arr[right]) {
            right--;
        }

        // 3. Initial answer: remove everything after prefix or everything before suffix
        int ans = Math.min(n - left - 1, right);

        // 4. Try to merge prefix and suffix using two pointers
        int i = 0, j = right;
        while (i <= left && j < n) {
            if (arr[i] <= arr[j]) {
                ans = Math.min(ans, j - i - 1);
                i++;
            } else {
                j++;
            }
        }

        return ans;
    }
}