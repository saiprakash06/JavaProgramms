package com.qa.patterns;

public class Patterns {
    public static void main(String[] args) {
//        leftTrianglePascal(5);
//        mirroredRightTriangle(4);
//        sandGlassStarPattern(5);
        triangleStarPattern(5);
        //  numbers(5);
//        hallowSquare(5);
    }


    static void leftTrianglePascal(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalSpaces = (row <= n) ? (n - row) : (row - n);
            for (int spaces = 1; spaces <= totalSpaces; spaces++) {
                System.out.print(" ");
            }

            int totalColumns = (row <= n) ? row : 2 * n - row;

            for (int col = 1; col <= totalColumns; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void mirroredRightTriangle(int n) {

        for (int row = 1; row <= n; row++) {

            for (int spaces = 1; spaces <= (n - row) + 1; spaces++) {
                System.out.print("  ");
            }

            int totalColumns = row;

            for (int col = 1; col <= totalColumns; col++) {
                System.out.print(" *");
            }

            System.out.println();

        }

    }

    static void sandGlassStarPattern(int n) {

        for (int row = 1; row <= 2 * n; row++) {
            int totalSpaces = (row <= n) ? row : (2 * n - row) + 1;
            for (int spaces = 1; spaces <= totalSpaces; spaces++) {
                System.out.print(" ");
            }

            int totalColumns = (row <= n) ? (n - row) + 1 : row - n;

            for (int col = 1; col <= totalColumns; col++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }

    static void triangleStarPattern(int n) {

        for (int row = 1; row <= n; row++) {

            for (int spaces = 1; spaces <= (n + row); spaces++) {
                System.out.print(" ");
            }

//            int totalColumns = row;
            int totalColumns = n - row;
            for (int col = 1; col <= totalColumns; col++) {
//                System.out.print("* ");
                if (col == 1 || col == totalColumns || totalColumns == n-1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }

            }

            System.out.println();

        }

    }

    static void numbers(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces <= n - row; spaces++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();

        }
    }


    static void hallowSquare(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n + 1; col++) {

                if (row == 1 || col == 1 || row == n || col == n + 1) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");

            }
            System.out.println();
        }
    }


}
