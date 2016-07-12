//Nested Class:- Inner Class Static

class T{
	//static members are used by class names(T.'static-member')
	static int e=100;
	static void print(){
		System.out.println("T print...");
	}
	//When class is static all the members must be static.
	static class TT{	//Nested Class
		static void show(){
			System.out.println("TT show...");
		}
	}
}
public class NestedClass {

	public static void main(String[] args) {
		T.e=200;
		T.print();
		T.TT.show();

	}

}
