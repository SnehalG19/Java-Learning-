package com.projectseries;
import java.util.*;
public class Homework2 {
    public static void main(String[] args){
//        print all even number till n
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=0;i<=n;i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
//            else{
//                continue;
//            }
//        }

//        for(; ;){
//            System.out.println("Apna College");
//        }
//        make a menu driven program. the user can enter 2 numbers,either 1 or 0.
//        if user enter 1 then keep taking input from the user for a student's marks(out of 100)
//        if they enter 0 then stop:
//        marks->=90->print"This is good"
//        89-60->"This is also good"
//        59-0->"this is good as well"

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Enter the marks ");
            int marks = sc.nextInt();
            if (marks >= 90 && marks <=100) {
                System.out.println("This is Good");
            } else if (60<= marks && marks <= 89) {
                System.out.println("This is also Good ");
            } else if (1<=marks && marks <= 59) {
                System.out.println("This is good as well");
            } else {
                System.out.println("Invalid marks input");
            }
            System.out.println("Want to continue ? (Yes(1) or no(0))");
            n =sc.nextInt();

        }while (n == 1) ;



    }
}
