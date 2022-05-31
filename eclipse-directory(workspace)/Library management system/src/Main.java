import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		
		int choice=0;
		
		while(choice !=3) {
			choice =obj.nextInt();
			
			if(choice == 1) {
			module1 obj1=new module1();
			    System.out.println("Enter Student's name");
			obj1.name=obj.nextLine();
			    System.out.println("Enter the father name");
			    obj1.fname=obj.nextLine();
			    System.out.println("Enter University id");
	            obj1.uni_id=obj.nextLine();
	            System.out.println("Enter User id");
	            obj1.uid=obj.nextLine();
	            System.out.println("Enter in which semester do you study:");
	            obj1.sem=obj.nextInt();
	            
	            obj1.getdata(obj1.name, obj1.fname, obj1.uni_id, obj1.uid, obj1.sem);
	            obj1.setdata();
			    
			}
			
			else if(choice ==2) {
				module2 obj2=new module2();
				
				obj2.chemistry();
				obj2.physics();
				obj2.biology();
			}
		}

	}

}
//package 
//import java.util.*;
//public class StackPush{
//
//		public static void main(string[] args){
///*creating object the objet of stack class*/
//			Stack<String> st=new Stack<>();
///*pushing all the elements to the stack*/
//			st.push("");
//			st.push("");
//			st.push("");
//			st.push("");
//			st.push("");
///*printing all the elements*/
//			System.out.println("Stack:"+st);
///*pop the element*/
//			System.out.println("After popping:"+st.pop());
//		}
//}
//
