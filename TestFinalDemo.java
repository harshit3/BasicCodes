/*
 String is a final class.A final class can't be inherited.
 
class Amit extends String{
	
}
*/

//this is OK.this class can't be inherited.
//final class FinalDemo {

	//this is not OK.final:-no inheritance, abstract:-inheritance
	//final abstract class FinalDemo{

	class FinalDemo{
		
		//All letters capital recommended(easy to identify constant)
		//Can be used when same value is used at several places.Changes to that value done only to variable instead of each occurrence. 
		final float PI=3.14f;
		final int MAX_AGE;
		FinalDemo(){
			MAX_AGE=100;
		}
		
		FinalDemo(int x){
			this();
			//once assigned final value cannot be reassigned-
			//MAX_AGE=x;
		}
		 final void show(){
			System.out.println("FinalDemo SHOW...");
			print();
		}
		 
		 //This method cannot not be accessed outside the class.
		 private final void print(){
			 System.out.println("FinalDemo Printing...");
		 }
	}
	
	
//When we have to change some functionality of a class we must inherit it and then change.We should not directly change it.
	
class A extends FinalDemo{
	
	//this shows error:-
	//void show(){
	
	
	//@Override   <--- annotation.
	//overloading:-
	void show(int x){
		System.out.println("A class Show");
		
	}
	
	//this print method is different from the one in parent class as the print() in parent is private and is not available to the child. 
	//So this not overriding.There is no roll of final.
	void print(){
		System.out.println("A class print");
	}

}

public class TestFinalDemo{
	public static void main(String args[]){
		
		FinalDemo obj=new FinalDemo();
		obj.show();
		System.out.println("Max Age is "+obj.MAX_AGE);
		
		//print method is private.so error-
		//obj.print();
		
		System.out.println("   ******");
		A obj1=new A();
		obj1.show();;
		obj1.show(5);
		obj1.print();
	}
	
}