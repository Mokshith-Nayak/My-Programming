package com.PatternSolving;

public class Pattern2 {
    public static void halfDiamond1(int n) {
        System.out.println("\nHALF DIAMOND 1");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void halfDiamond2(int n) {
        System.out.println("\nHALF DIAMOND 2 : Efficient");
        for (int i = 1; i <= 2*n; i++) {
            int totalColInRow = (i<n) ? i: 2*n-i;
            for (int j = 1; j <= totalColInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diamond1(int n) {
        System.out.println("\nDIAMOND 1");
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            for (int k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void diamond2(int n) {
        System.out.println("\nDIAMOND 1 : Efficient");
        for (int i = 1; i <= 2*n; i++) {

            int printSpace = (i<=n)? n-i : i-n;
            for (int k = 1; k <= printSpace; k++) {
                System.out.print(" ");
            }

            int printStar = (i<n)? i : 2*n-i;
            for (int j = 1; j <= printStar; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pyramidNumber(int n) {
        System.out.println("\nPYRAMID IN NUMBERS");
        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= n-i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void diamondNumber(int n) {
        System.out.println("\nDIAMOND IN NUMBER");
        for (int i = 1; i <= 2*n; i++) {

            int printSpace = (i<=n)? n-i : i-n;
            for (int k = 1; k <= printSpace; k++) {
                System.out.print("  ");
            }

            int printStar = (i<n)? i : 2*n-i;
            for (int j = printStar; j >= 1; j--) {
                System.out.print(j+" ");
            }

            for (int j = 2; j <=printStar; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void numberPattern(int n){

        System.out.println("\nNUMBER HOLLOW SQUARE WITH " + n);

        n = 2*n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

// int minDist = Math.min(Math.min(i, j), Math.min(2 * n - 2 - i, 2 * n - 2 - j));
                // Compute distances manually
                int topDist = i - 1;        // Distance from top border
                int leftDist = j - 1;       // Distance from left border
                int bottomDist = n - i;     // Distance from bottom border
                int rightDist = n - j;      // Distance from right border

                // Manually find the minimum distance
                int minDist = topDist;  // Assume topDist is the smallest

                if (leftDist < minDist) {
                    minDist = leftDist;
                }
                if (bottomDist < minDist) {
                    minDist = bottomDist;
                }
                if (rightDist < minDist) {
                    minDist = rightDist;
                }

                // Print the required number
                System.out.print((n/2+1 - minDist) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n=5;
        halfDiamond1(n);
        halfDiamond2(n);
        diamond1(n);
        diamond2(n);
        pyramidNumber(n);
        diamondNumber(n);
        numberPattern(n);

    }
}
