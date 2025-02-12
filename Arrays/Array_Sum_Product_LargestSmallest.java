package com.Arrays;

import java.util.Scanner;

public class Array_Sum_Product_LargestSmallest {

    public static int firstLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int secondLargest(int[] arr){

        int p=Integer.MIN_VALUE;
        int vp=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > p) {
                vp=p;   // Update second largest
                p=arr[i];   // Update largest
            } else if(arr[i]>vp)
                {
                    vp=arr[i];  // Update second largest
                }
            }
        return vp;
    }
    public static int firstSmallest(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int secondSmallest(int[] arr){
        int p = Integer.MAX_VALUE;
        int vp = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<p){
                vp=p;
                p=arr[i];
            }else if(arr[i]<vp){
                vp=arr[i];
            }
        }
        return vp;
    }

    public static int sumOfMaxPair(int[] arr){
       int sum = firstLargest(arr) + secondLargest(arr);
        return sum;
    }
    public static int sumOfMinPair(int[] arr){
        int sum = firstSmallest(arr) + secondSmallest(arr);
        return sum;
    }
     public static int productOfMaxPair(int[] arr){
       int product = firstLargest(arr) * secondLargest(arr);
        return product;
    }
    public static int productOfMinPair(int[] arr){
        int product = firstSmallest(arr) * secondSmallest(arr);
        return product;
    }

    public static int productOfExtremePair(int[] arr) {

        int maxProduct = productOfMaxPair(arr);
        int minProduct = productOfMinPair(arr);

        return (maxProduct>minProduct) ? maxProduct : minProduct;   // return Math.max(maxProduct, minProduct);
    }
    public static int mixedProductPair(int[] arr) {
        int firstSmallest = firstSmallest(arr);
        int firstLargest = firstLargest(arr);

      return firstLargest * firstSmallest;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
//        System.out.println(firstSmallest(arr));
//        System.out.println(sumOfMaxPair(arr));
//        System.out.println(secondSmallest(arr));
//        System.out.println(sumOfMinPair(arr));
//        System.out.println(productOfMaxPair(arr));
//        System.out.println(productOfMinPair(arr));
        System.out.println(productOfExtremePair(arr));
        System.out.println();
//        System.out.println(mixedProductPair(arr));
    }
}
