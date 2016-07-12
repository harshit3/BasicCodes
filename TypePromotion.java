//In OVERLOADING:-
/*Type Promotion(includes the concepts of wrapper class,primitive types,var-args,widening rule) Rules-
Java always gives chance to 'int' first.
If int not there then widening rule applies.(sequence:- int->long->float->double)Only for primitives.
Then next it considers wrapper class(of same type).
Then VarArgs.
when none of above method there.Then error.*/

class Type{
	
	//Overloaded Methods:-
	void print(byte x){
		System.out.println("byte");
	}

	void print(short x){
		System.out.println("short");
	}
	
	void print(int x){
		System.out.println("int");
	}
	
	void print(long x){
		System.out.println("long");
	}
	
	void print(float x){
		System.out.println("float");
	}
	
	void print(Integer x){
		System.out.println("Integer");
	}
	
	void print(Long x){
		System.out.println("Long");
	}
	
	void print(int ...x){
		System.out.println("var-args");
	}
}
public class TypePromotion {

	public static void main(String[] args) {
		Type type=new Type();
		type.print(10);
		type.print(10.0f);
		type.print((Integer)24);
		type.print((long)23);
		//type.print((Long)56);(error why?)
	}

}
