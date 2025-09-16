import java.util.Scanner;

public class A01_Zero_Indexed_Permutaion {
    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.print("Enter nums :");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.print("nums : ");
        {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
        // creating object for non static method or make method static
        A01_Zero_Indexed_Permutaion solution = new A01_Zero_Indexed_Permutaion();
        int[] ans = solution.buildArray(nums);

        System.out.print("ans : ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        in.close();
    }
}