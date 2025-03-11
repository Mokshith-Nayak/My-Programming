package com.LeetCode;

import java.util.ArrayList;
import java.util.List;
//CycliSort (Range: [1,N])
public class FindAllDuplicates_442 {

    public static List<Integer> findAllDuplicates(int[] nums) {

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
                list.add(nums[index]);
            }
        }
        return list;
    }


    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> list = findAllDuplicates(arr);
        System.out.println(list);
    }
}
