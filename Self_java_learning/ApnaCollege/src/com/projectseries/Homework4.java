package com.projectseries;
import java.util.*;
public class Homework4 {
    public static void main(String[] args){
        //        Hollow butterfly
        /*
         *    *
         **  **
         * ** *
         * ** *
         **  **
         *    *
         */
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                if(j!=1 && j!=i){
//                    System.out.print(" ");
//                }else {
//                    System.out.print("*");
//                }
//            }
//            for(int j=1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                if(j!=1 && j!=i){
//                    System.out.print(" ");
//                }else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                if(j!=1 && j!=i){
//                    System.out.print(" ");
//                }else {
//                    System.out.print("*");
//                }
//            }
//            for(int j=1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                if(j!=1 && j!=i){
//                    System.out.print(" ");
//                }else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }


////        /* Solid rhombus
////         * * * * *
////         *       *
////         *       *
////         *       *
////         * * * * *
////
////         */
//            Scanner sc =new Scanner(System.in);
//            int n=sc.nextInt();
//            int m=sc.nextInt();
////        outer loop
//            for(int i=1; i<=n; i++){
////              inner loop
//                for(int j=1;j<=n-i;j++){
//                    System.out.print("  ");
//                }
//                for(int j=1; j<=m; j++){
////                  cell-> (i,j)
//                    if (i==1 || j==1 || i==n || j==m){
//                        System.out.print("* ");
//                    }
//                    else{
//                        System.out.print("  ");
//                    }
//                }
//                System.out.println();
//            }


//        //        half pyramid
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//
//
//
//        //        Inverted half pyramid
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(n+1-i+" ");
//            }
//            System.out.println();
//        }
//
////        Pascal's Triangle
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=0;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            int c=1;
//            for(int k=1;k<=i;k++){
//                System.out.print(c+" ");
//                c=c*(i-k)/k;
//            }
//            System.out.println();
//        }
    }
}
