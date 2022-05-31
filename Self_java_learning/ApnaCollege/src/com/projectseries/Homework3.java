package com.projectseries;
import java.util.*;
public class Homework3 {
    public static void main(String[] args) {

//        number pyramid
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
//            first part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
//            Second part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//            lower half
            for(int i=n;i>=1;i--){
//            first part
                for(int j=1;j<=i;j++) {
                    System.out.print("*");
                }
                int spaces= 2*(n-i);
                for(int j= 1;j<=spaces;j++){
                    System.out.print(" ");
                }
//            Second part
                for(int j=1; j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();


            }



//        for(int i=1;i<=n;i++){
////            Spaces
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//Check if number is prime or not
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        boolean isPrime = true;
//        for(int i=2;i<=n/2;i++){
//            if(n%i ==0){
//                isPrime = false;
//                break;
//            }
//        }
//        if(isPrime){
//            if (n==1){
//                System.out.println("This is neither prime nor composite");
//            }else {
//                System.out.println("This is a prime number");
//            }
//        }else{
//            System.out.println("This is not a prime number");
//        }

    }
}

