import java.io.IOException;

//Overriding using Weaker Access Rule
//*******************************************************
class D{
	void show(){
	  System.out.println("Class D show");	
	}
	
	void print(){
		System.out.println("Class D print");
	}
	
}

class E extends D{
	
	//Weaker Access Rule:-In overriding, scope may expand but can't contract.(ex->default to public or protected.)
	//Annotation is used to give meta information to the compiler.
	@Override
	public void show(){
		System.out.println("Class E show");
		
	}
	
	void print(){
		System.out.println("Class E print");
	}
}

//**********************************************************




//Overriding using CO VARIANT return type.This approach was introduced in java 1.5.
//Here return type of overridden method can change only to its improvised version(i.e. its child class)
//**********************************************************

class X{
	X show(){
		System.out.println("Class X show");
		X obj=new X();
		return obj;
	}
	
	D print(){
		System.out.println("class X Print method with return type D");
		D obj2=new D();
		return obj2;
	}
}
class Y extends X{
	@Override
	//public Y show(){  /*Here using both Co-variant return type and weaker access rule.*/
	Y show(){
		System.out.println("Class Y show");
		Y obj1=new Y();
		return obj1;
	}
	
	//E is child of D.So return type can be changed from D to E in print method. 
	@Override
	E print(){
		System.out.println("class Y Print method with return type D");
		E obj3=new E();
		return obj3;
	}
}
//***********************************************************

//***********************************************************
//Exceptions:-If parent method throws some exception, then child will throw same exception or its sub-type.(Only For Checked Exception.)
class Parent{
	public void show() throws Exception{
		System.out.println("Parent Show...");
	}
}
class Child extends Parent{
	@Override
	public void show() throws IOException{
		System.out.println("Child Show...");
	}
}
public class OverrideDemo {

	public static void main(String[] args){
		
	D obj=new D();
	obj.show();
	obj.print();
	
	System.out.println("  *****");
	
	E obj1=new E();
	obj1.show();
	obj1.print();
	
	System.out.println("*******************************");
	
	X ob=new X();
	D ob1=ob.print();
	ob1.print();
	
	Y ob2=new Y();
	Y ob3=ob2.show();
	ob3.print();
	
	System.out.println("*******************************");
	
	/*
	Parent p=new Parent();
	p.show();
	Child c=new Child();
	c.show();
	*/
	
	}
}
