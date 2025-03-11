package com.LeetCode;

//CyclicSort
public class FirstMissingPositive_41 {

    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i< nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[correctIndex] != nums[i]){
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        //Search for 1st missing element
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){  //where index not pointing to its respective number(eg: arr[3]->3)
                return index+1;
            }
        }
        return nums.length+1;
    }

    public static void main(String[] args) {

        int[] arr1 = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr1));

        int[] arr2 = {7,8,9,11,12};
        System.out.println(firstMissingPositive(arr2));
    }
}