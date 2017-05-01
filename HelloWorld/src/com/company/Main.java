package com.company;

public class Main {

    public static void main(String args[]) {
        /*This just print simple message */
        // Single line comment

        System.out.println("Let's learn Java");
        System.out.println("Java is awesome");

        //Calculating circel area

        double rad;
        final double PI = 3.14259;

        rad = 10.0;
        double area = PI * rad * rad;
        System.out.println("The are of the circle is " + area);

        //Programs to add two numbers
         int num1, num2, sum;

         num1 = 10;
         num2 = 20;

         sum = num1 + num2;

        System.out.println("The sum of the two numbers is " + sum);

        //Swapping two numbers

        int x,y, t;
        x = 3;
        y = 4;
        System.out.println("Before swapping " + x + " " + y + " = " + x + y);


        t = x;
        x = y;
        y= t;
        System.out.println("Before swapping " + x + " "+ y + " = " + x + y);
        //Swapping two numbers without third variables

        int a1, b1;
        a1 = 10;
        b1 = 20;

        System.out.println("Before swapping " + a1 + " " + b1 + " = " + a1 + b1);
        a1 = a1 +b1;
        b1 = a1 -b1;
        a1 = a1 -b1;

        System.out.println("Before swapping " + a1 + " " + b1 + " = " + a1 + b1);

        //Finding area of a triangle for its three sides using Herons formula

        double areaTriangle, a, b, c, s;
        a = 8;
        b = 5;
        c = 10;
        s = (a +b +c)/2;
        areaTriangle = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle is " + areaTriangle);

        // Compound interest
        double amount, p, r, n, ci;
        p = 1000;
        r = 10;
        n = 3;

        amount = p * Math.pow((1 + (r/100.0)),n);
        ci = amount -p;

        System.out.println("Amount=" + amount);
        System.out.println("Compound interest = " + ci);

        //Dynamic initialization

        double l= 3,w =4;
        double h = Math.sqrt(l * l  + w * w);

        System.out.println("The hypothenous of the triangle is  " + h);

        // String
        msg = "Let's learn Java";
        System.out.println("Java is awesome." + msg);
        Main obj = new Main();
        obj.hello = "Hello World";

        System.out.println("First message:" + obj.hello);

        // character variables

        char ch1, ch2;
        ch1 = 88;
        ch2 = 'Y';

        System.out.println("ch1 and ch2:" + ch1 + " " + ch2);
        ch1++;
        System.out.println("ch1:"+ch1);




    }

    static String msg;
    String hello;
}
