package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter value for x1");
        int x1=sc.nextInt();

        System.out.println("Enter value for x2");
        int x2=sc.nextInt();

        System.out.println("Enter value for y1");
        int y1=sc.nextInt();

        System.out.println("Enter value for y2");
        int y2=sc.nextInt();

        double length=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Length of Line : " + length);

    }
}
