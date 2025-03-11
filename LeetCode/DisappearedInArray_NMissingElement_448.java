package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

//CyclicSort(Range: [1,N])
public class DisappearedInArray_NMissingElement_448 {

    public static List<Integer> disappearedInArray(int[] nums){

        int i=0;
        while(i< nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index+1){
                list.add(index+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> list = disappearedInArray(arr);
        System.out.println(list);
    }
}
