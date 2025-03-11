package com.LeetCode;

//Cyclic Sort(Range: [1,N])
public class FindDuplicateNumbers_287 {

    public static int findDuplicates(int[] nums) {
        int i=0;
        while(i< nums.length){

            if(nums[i] != i+1){
                int correctIndex = nums[i]-1;
                if(nums[i] != nums[correctIndex]){
                    int temp = nums[correctIndex];
                    nums[correctIndex] = nums[i];
                    nums[i] = temp;
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicates(arr));    //2

        int[] arr1 = {3,1,5,6,4,6,2};
        System.out.println(findDuplicates(arr1));   //6

    }
}
