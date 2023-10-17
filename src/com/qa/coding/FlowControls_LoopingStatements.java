package com.qa.coding;

public class FlowControls_LoopingStatements {

    public static void main(String[] args) {
        //Flow Controls

        int i = 10;

        //simple if
        if (i < 4) {
            System.out.println("simple if");
        }

        //if else

        if (i > 4) {
            System.out.println("if else");
        } else {
            System.out.println("if else");
        }

        //if else if

        if (i > 3) {
            System.out.println("if else if");
        } else if (i > 5) {
            System.out.println("if else if");
        } else {
            System.out.println("if else if");
        }

        // Looping Statements
// for loop
        for (int j = 0; j <= 10; j++) {
            System.out.println("for loop");
        }
        // while loop

        int k = 0;
        while (k < 7) {
            System.out.println("i am in while  " + k);
            k++;
        }
//do while
        int h = 0;
        do {

            System.out.println("i am in do while " + h);

        } while (h > 8);

        //switch statement

        int s=2;
        switch (s) {
            case 1:
                System.out.println("i am in case 1");
                break;
            case 2:
                System.out.println(" i am in case 2");
                break;

            default:
                System.out.println("i am at default no condition met");
        }


        //jump statements
        //break,continue,return

      


    }
}
