//e is defined in both inner class and outer class-
//Inheritance may exist among InnerClasses
//Interface may be implemented by an inner class.
class AA{
	int e=100;	
	void show(){
		System.out.println("A show...");
	}

	class BB{
		int e=200;
		int sum=AA.this.e+this.e;
		void print(){
			System.out.println("The sum is:-"+ sum);
		}
		void show(){
			AA.this.show();
			System.out.println("BB show...");
		}
	}
}


public class InnerClassRule {

	public static void main(String[] args) {
		AA.BB obj=new AA().new BB();
		obj.print();
		obj.show();

	}

}
