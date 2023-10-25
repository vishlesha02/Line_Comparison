package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

        Scanner sc =new Scanner(System.in);

        Double sum1=0.0 , sum2=0.0;

        public void equalsMethod() {
            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter the value for Line " + i);
                System.out.print("Enter value of x1 = ");
                int x1 = sc.nextInt();

                System.out.print("Enter value of x2 = ");
                int x2 = sc.nextInt();

                System.out.print("Enter value of y1 = ");
                int y1 = sc.nextInt();

                System.out.print("Enter value of y2 = ");
                int y2 = sc.nextInt();


                if (i == 1) {
                    sum1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
                    System.out.println("Sum of line 1 :" + sum1);
                } else {
                    sum2 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
                    System.out.println("Sum of line 2 :" + sum2);


                }
            }


            String sumofLine1 = String.valueOf(sum1);
            String sumofLine2 = String.valueOf(sum2);
            if (sumofLine1.equals(sumofLine2)) {
                System.out.println("Both lines are equal");
            } else {
                System.out.println("Both lines are not equal");
            }
        }

        public void compareTOMethod() {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter the value for Line " + i);
                System.out.print("Enter value of x1 = ");
                int x1 = sc.nextInt();

                System.out.print("Enter value of x2 = ");
                int x2 = sc.nextInt();

                System.out.print("Enter value of y1 = ");
                int y1 = sc.nextInt();

                System.out.print("Enter value of y2 = ");
                int y2 = sc.nextInt();


                if (i == 1) {
                    sum1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
                    System.out.println("Sum of line 1 :" + sum1);
                } else {
                    sum2 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
                    System.out.println("Sum of line 2 :" + sum2);


                }
            }
            int comparison = sum1.compareTo(sum2);

            if (comparison == 0) {
                System.out.println("Both lines are equal");
            } else if (comparison > 0) {
                System.out.println("Line 1 is greater than Line 2");
            } else {
                System.out.println("Line 2 is greater than Line 1");
            }
        }


    public static void main(String[] args) {
            LineComparison l=new LineComparison();
            l.equalsMethod();
            l.compareTOMethod();
    }
}
