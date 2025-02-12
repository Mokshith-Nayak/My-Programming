package com.Array_2D;
import java.util.Arrays;
import java.util.Scanner;

//LeetCode 1295
public class Two_Sum_1 {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // throw new IllegalArgumentException("No solution found");
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int[] res = twoSum(nums, target);
        // for(int i=0; i<res.length; i++){
        //     // System.out.println(res[i]+" ");
        // }
        System.out.print(Arrays.toString(res));

    }
}
