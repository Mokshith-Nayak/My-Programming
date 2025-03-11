package com.LeetCode;

//Missing number using CyclicSort(Range: [0,N])
public class MissingNumber_268 {

    public static int missingNumber(int[] nums) {

        int i=0;
        while(i< nums.length){
            int correctIndex = nums[i];
            //while both index and array start from 0, nums.length should be ignored to avoid OOBAI_Exception
            if(nums[i] < nums.length && nums[correctIndex] != nums[i]){
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        //Search for missing element
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index ){  //where index not pointing to its respective number(eg: arr[3]->3)
                return index;
            }
        }
    return nums.length;
    }

    public static void main(String[] args) {

        int[] arr = {2,4,1,0,3,5,9,7,8};

        System.out.println(missingNumber(arr));
        System.out.println("Missing: "+MissingNumber.missingNumber(arr));
    }
}

//More Efficient for Missing no. in array
class MissingNumber {

    public static int sum(int[] nums){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum1 = n*(n+1)/2 ;
        int sum2 = sum(nums);
        return sum1 - sum2;
    }

}