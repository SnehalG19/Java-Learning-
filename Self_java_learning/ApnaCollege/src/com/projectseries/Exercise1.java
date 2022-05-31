package com.projectseries;
import java.util.*;

public class Exercise1 {
    //1
//    public static float printAverage(int a, int b, int c){
//        float average = (a+b+c)/3;
//        System.out.println("The average is : " + average);
//        return average;
//    }
    //2
//    static int n1=0,n2=1,n3=0;
//    public static void printFibonacci(int n){
//        if(n>0){
//            n3=n1+n2;
//            n1=n2;
//            n2=n3;
//            System.out.print(" "+n3);
//            printFibonacci(n-1);
//        }
//    }
    //3
//    public static int sumOfOdds(int n){
//        int sum=0;
//        for(int i=1;i<=n;i++){
//            if(i%2!=0){
//                sum= sum+i;
//            }
//        }
//        System.out.println("The sum is : "+ sum);
//        return sum;
//    }
    //4
//    public static void printGreater(int a,int b){
//        if(a>b){
//            System.out.println("Greater number is : " + a);
//        }else if(a<b){
//            System.out.println("Greater number is : " +b);
//        }else{
//            System.out.println("None is greater as both are equal ");
//        }
//    }
    //5
//    public static float printCircumference(int r){
//        float pi=22/7;
//        float circumference = 2*pi*r;
//        System.out.println(circumference);
//        return circumference;
//    }
    //6
//    public static void eligibleToVote(int age){
//        if(age>=18){
//            System.out.println("You are eligible to vote");
//        }else{
//            System.out.println("Sorry! YOu are not eligible to vote");
//        }
//    }
    //7
//    static int N=0, P=0, Z=0,n,num;
//    public static void printCount(int n,int num){
//        do{
//            Scanner sc= new Scanner(System.in);
//            System.out.print("Enter number: ");
//            n=sc.nextInt();
//            if(n<0){
//                N=N+1;
//            }else if(n>0){
//                P=P+1;
//            }else{
//                Z=Z+1;
//            }
//            System.out.println("If want to input again enter 1");
//            num=sc.nextInt();
//        }while(num==1);
//        System.out.println("Total negative are : "+ N);
//        System.out.println("Total positive are : "+ P);
//        System.out.println("Total Zeroes are : "+ Z);
//    }
    //8
//    static int x=1, n=1, p=1;
//    public static void raisedToFunction(int x,int n){
//        int t= 1;
//        int i=1;
//        do{
//            for(i=1;i<=n;i++){
//                t=t*x;
//            }
//        }while(i==n);
//        System.out.println("x^n : "+t);
//    }
    //9
//    public static void greatestCommonDivisor(int x,int y){
//        int gcd= 1;
//        for(int i=1;i<=x && i<=y;i++){
//            if(x%i==0 && y%i==0){
//                gcd=i;
//            }
//        }
//        System.out.println("The GCD of "+x+" and "+y+" is : "+gcd);
//    }


    public static void main(String[] args){
        //1
//        //Enter 3 numbers from user & print their average
//        Scanner sc =new Scanner(System.in);
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//        printAverage(a,b,c);

        //2
//
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.print(n1+" "+n2);
//        printFibonacci(n-2);

        //3
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
////        System.out.print(n1+" "+n2);
//        sumOfOdds(n);

        //4
//        Scanner sc= new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
////      print grater of two numbers
//        printGreater(a,b);

        //5
//        Scanner sc= new Scanner(System.in);
//        int r=sc.nextInt();
////      take r as input and return circumference
//        printCircumference(r);

        //6
//        Scanner sc= new Scanner(System.in);
//        int age=sc.nextInt();
////      input agew and print if eligible to vote
//        eligibleToVote(age);

        //7
//        //take n input from user until the user want it and then count positive, negative & zeroes.
//        printCount(n,num);

        //8
//        //take n input from user until the user want it and then count positive, negative & zeroes.
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter x : ");
//        int x=sc.nextInt();
//        System.out.print("Enter n : ");
//        int n=sc.nextInt();
//        raisedToFunction(x,n);

        //9
//        //take two numbers as input and print their gcd
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter x : ");
//        int x=sc.nextInt();
//        System.out.print("Enter y : ");
//        int y=sc.nextInt();
//        greatestCommonDivisor(x,y);

        //10
//        //infinite loop using do while condition
//        int n=1;
//        do{
//            System.out.println("Hello World!");
//        }while(n==1);


    }

}
