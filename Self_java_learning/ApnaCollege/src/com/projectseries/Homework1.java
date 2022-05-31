package com.projectseries;
import java.util.*;

public class Homework1 {
    public static void main(String[] args){
//make a calculator. Take 2 numbers (a & b) from the user and an operation as follows:
//Addition, Subtraction, Multiplication, Division, Modulo/Remainder
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b =sc.nextInt();
        System.out.println("Enter for operation");
        int operator=sc.nextInt();
        switch (operator){
            case 1:
                int sum=a+b;
                System.out.println(sum);
                break;
            case 2:
                int sub=a-b;
                System.out.println(sub);
                break;
            case 3:
                int multi=a*b;
                System.out.println(multi);
                break;
            case 4:
                int division=a/b;
                if(b==0){
                    System.out.println("Invalid Dicision");
                }else{
                    System.out.println(division);
                }
                break;
            case 5:
                int remainder=a%b;
                if(b==0){
                    System.out.println("Invalid Dicision");
                }else{
                    System.out.println(remainder);
                }
                break;
            default:
                System.out.println("Invalid operator");

        }


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
//        int a=sc.nextInt();
//        int b =sc.nextInt();
//        int total= a + b ;
//        int d= a - b;
//        int e=a * b;
//        int f= a/b;
//        int g = a%b;
//        System.out.println("Sum is: " + total);
//        System.out.println("Subtraction is: " + d);
//        System.out.println("Multiplication is: " +e);
//        System.out.println("Division is: " +f);
//        System.out.println("remainder of division is: " +g);

//        Ask the user to enter number of the month & print the name of the month.
//        for eg- for 1 print 'January'
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number from 1 to 12");
//        int num=sc.nextInt();
//        switch (num){
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("Jun");
//                break;
//            case 7:
//                System.out.println("July");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("September");
//                break;
//            case 10:
//                System.out.println("October");
//                break;
//            case 11:
//                System.out.println("November");
//                break;
//            case 12:
//                System.out.println("December");
//                break;
//        }

    }


}
