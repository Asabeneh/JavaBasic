package com.company;

import java.io.Console;
import java.util.*;

class Constants{
    public static final int NUMBER_OF_DAYS = 365;
    public static final int NUMBER_OF_WEEKS = 52;
    public static final int NUMBER_OF_MONTHS = 12;
    public static final int NUMBER_OF_HOURS = 24;



}

public class Main {
    static final int NUMBER_OF_MONTHS = 12;
    static final double PI = (double)22/7;

    public static void main(String[] args) {

        //print string with line break
        System.out.println("Hello\nI am Asabeneh");

        // getting user input using Scanner Class and calculating sum, substraction, mutiplicaton, modulous, and division

        Scanner input = new Scanner(System.in);

        int firstNum = input.nextInt();
        int secondNum = input.nextInt();

        int sumofTwo = firstNum + secondNum;

        int prod = firstNum * secondNum;
        int sub = firstNum - secondNum;
        int div = firstNum/secondNum;
        int mod = firstNum%secondNum;


        System.out.println(firstNum + " + " + secondNum  + " = " + sumofTwo);
        System.out.println(firstNum + " * " + secondNum  + " = " + prod);
        System.out.println(firstNum + " - " + secondNum  + " = " + sub);
        System.out.println(firstNum + " / " + secondNum  + " = " + div);
        System.out.println(firstNum + " % " + secondNum  + " = " + mod);
        System.out.println("Enter a number");
        for(int k = 0; k <=10; k++){
            int res = 8 * k;
            System.out.println( 8 + " x "+ k + " = " + res);
        }
        System.out.println("What is the result "+ ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) );


        // Area of a circle

        double radius = 7.5;
        double perimeter;
        double areaC;

        areaC= PI * radius * radius;
        perimeter = 2* PI * radius;

        System.out.println("The area of the circle is " + areaC + ".\n" +"The perimeter is " + perimeter);

        // Printing strings in pattern

        System.out.println("  J    a   v     v a");
        System.out.println("  J   a a   v   v a a");
        System.out.println("J J  a a a a v  v a a a a");
        System.out.println(" JJ a      a   v   v a   a");

        // Printing smile

        System.out.println(" \"+\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |  ");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");

        //Printing American Flag

        for (int i = 1; i <=15 ; i ++){
            if(i <= 9){
                if(i % 2 == 1){
                    System.out.println("* * * * * * ==================================");

                }
               else{
                    System.out.println(" * * * * *  ================================== ");
                }
            }
            else{
                System.out.println("==============================================");
            }



        }

        //swapping two numbers

        int c = 7;
        int d =8;
        int e ;
        System.out.println(c + " " + d + "=" + c + d);

        e = c;
        c = d;
        d =e;

        System.out.println(c + " " + d + "=" + c + d);

        String firstBin = "10";
        String secondBin = "11";
        int sum ;

        int first1 = Integer.parseInt(firstBin,2);
        int second2= Integer.parseInt(secondBin,2);

                sum = first1 + second2;

        System.out.println("The sum is "+ sum);

        // Checking if Java is installed

        System.out.println("\nJava Version: "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");

        Scanner comp = new Scanner(System.in);


        int p,q;

        p = comp.nextInt();
        q = comp.nextInt();

        if(p > q){
            System.out.println(p + " 12" +
                    " is greater than " + q);
        }
        else if(q > p){
            System.out.println(p+ " is less than " + q);
        }
        else{
            System.out.println(q + " is equal to " + p);
        }

        if(p>q){
            System.out.println(p + " > " + q);
            System.out.println(p + " != " + q);
        }
        if(p<q){
            System.out.println(p + " != " + q);
            System.out.println(p + " < " + q);

        }

       Scanner value = new Scanner(System.in);
        int val = value.nextInt();
        int total = 0;
        while(val!=0){
            System.out.println(val%10);
            total+= val%10;
            val/=10;
        }
        System.out.println("what is this" + 3%4);

        String st = "xof nworb kciuq ehT";
        String temp = "";
        int len = st.length();

        System.out.println(st.charAt(0));
        System.out.println(len);
        for(int i = len-1; i>=0; i--){
            temp+=st.charAt(i);
        }

        System.out.println(temp);

        // adding the digits of  a number
        int num= 9119;
        int x;
        String sq = "";
        while(num!=0){
            x = num % 10;
            sq+=x * x;

            num/=10;}
        System.out.println("What is " + sq);


        int val1 = 10;
        int val2 = 91;
        int sum1 = val1 + val2;
        System.out.println("The sum is " + sum1);
        System.out.println((double)val2/val1);
        System.out.println(-5 + 8 * 6 );
        System.out.println((55+9) % 9 );
        System.out.println(20 + -3*5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3 );

        Console cn = System.console();
        int num1;
        System.out.println("Enter a number: ");
        num1= Integer.parseInt(cn.readLine());
        System.out.println("The number is " + num1);

        Scanner sc= new Scanner(System.in);
        int number;
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        System.out.println("The given number is " + number);

        Constants constants = new Constants();

        int numberOfHours = constants.NUMBER_OF_HOURS * constants.NUMBER_OF_DAYS;
        int i;
        for(i = 1; i <= 5; i++){
            increment();
        }
        System.out.println("NUMBER_OF_MONTHS:" + NUMBER_OF_MONTHS);
        System.out.println("PI: " + PI);

        System.out.println("Number of hours in a year " + numberOfHours);
    }

    private static void increment(){
        int x = 10;
        x++;
        System.out.println(" " + x);
    }

}
