/*
 * 1929. Concatenation of Array
 * Solved
 * Easy
 
 * 
 * Given an integer array nums of length n, you want to create an array ans of
 * length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n
 * (0-indexed).
 * 
 * Specifically, ans is the concatenation of two nums arrays.
 * 
 * Return the array ans.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,1]
 * Output: [1,2,1,1,2,1]
 * Explanation: The array ans is formed as follows:
 * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
 * - ans = [1,2,1,1,2,1]
 * 
 * Example 2:
 * 
 * Input: nums = [1,3,2,1]
 * Output: [1,3,2,1,1,3,2,1]
 * Explanation: The array ans is formed as follows:
 * - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
 * - ans = [1,3,2,1,1,3,2,1]
 * 
 * 
 * 
 * Constraints:
 * 
 * n == nums.length
 * 1 <= n <= 1000
 * 1 <= nums[i] <= 1000
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

class A02_Concatenation {
    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) // i<nums.length(0,1,2)
        {
            ans[i] = nums[i]; // i=0 first element
            ans[i + n] = nums[i]; // i=0 + n(length of nums = ) = 0 +3 is 3rd position
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of nums :");
        int size = in.nextInt();
        int[] nums = new int[size];
        System.out.print("Input:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.print("Output :");
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }
}
