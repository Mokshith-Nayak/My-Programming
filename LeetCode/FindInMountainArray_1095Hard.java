package com.LeetCode;

public class FindInMountainArray_1095Hard {

    interface MountainArray{
        int get(int index);
        int length();
    }

    public static class MountainArrayImpl implements MountainArray {
        private int[] arr;

        public MountainArrayImpl(int[] arr) {
            this.arr = arr;
        }

        public int get(int index) {
            return arr[index];
        }

        public int length() {
            return arr.length;
        }
    }

    public static int findPeakElement(MountainArray mountainArray, int length){
        int start = 0;
        int end = length-1;
        while(start<end){
            int mid = start + (end-start)/2;

            if(mountainArray.get(mid) > mountainArray.get(mid+1)){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    public static int orderAgnosticBS(MountainArray mountainArray, int target, int start, int end, boolean isAsc){

        while(start <= end){
            int mid = start+(end-start)/2;
            int midValue = mountainArray.get(mid);
            if(target == midValue){
                return mid;
            }
            if(isAsc){
                if(target > midValue){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            else{
                if(target < midValue){
                    start = mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }


    //Recursion_Fibonacci method
    public static int findInMountainArray(int target, MountainArray mountainArr){
        int length = mountainArr.length();
        int peak = findPeakElement(mountainArr,length);

        int ascending = orderAgnosticBS(mountainArr, target, 0,peak, true);

        if(ascending != -1){
            return ascending;
        }

        return orderAgnosticBS(mountainArr,target,peak+1, length-1,false);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,3,1};
        int target1 = 3;

        MountainArray mountainArr1 = new MountainArrayImpl(arr1);

        System.out.println(findInMountainArray(target1,mountainArr1));  //2

        int[] arr2 = {0,1,2,4,2,1};
        int target2 = 3;

        MountainArray mountainArr2 = new MountainArrayImpl(arr2);

        System.out.println(findInMountainArray(target2,mountainArr2));  //-1
    }
}
