package com.LeetCode;

//LeetCode 1672
public class Richest_Customer_Wealth_1672 {
    //In a 2-D array, To find the total sum of each array and To find the greater sum array.
    public static int maximumWealth(int[][] accounts){

        int total = 0;
        for(int[] account : accounts){
            int currentMoney = 0;
            for(int money : account){
                currentMoney = currentMoney + money;
            }
            total = Math.max(total,currentMoney);
        }
        return total;
    }

    public static void main(String[] args) {
             int[][] arr1 = {{1,2,3},{9,1,6},{3,3,7}};
             System.out.println(maximumWealth(arr1));   //16

             int[][] arr2 = {{1,2,3},{3,2,1}};
             System.out.println(maximumWealth(arr2));   //6
    }
}
//             Scanner scr = new Scanner(System.in);
//             int n1 = scr.nextInt();
//             int n2 = scr.nextInt();
//             int[][] arr1 = new int[n1][n2];

//             for(int i=0; i<arr1.length; i++){
//                 for(int j=0; j<arr1[i].length; j++){
//                     arr1[i][j]=scr.nextInt();
//                 }
//             }
