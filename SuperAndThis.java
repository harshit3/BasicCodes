class PP{
	int x;
	PP(){
		x=100;
		System.out.println("x is "+x);
		System.out.println("PP default cons called");
	}
	PP(int x){
		this();
		System.out.println("PP parameterized Cons called");
	}
}

class QQ extends PP{
	int x;
	QQ(){
		//super(); //this is added by default in the child constructor.like 'this()', 'super()' must always be the first line.
				   //i.e. When we create child object then child constructor by default calls the default constructor of parent class.
		super(100);	//parameterized constructor of parent called.
		x=200;
		int sum= x+x;	//this is equivalent to "this.x + this.x". this is included by default.
		int sum1=super.x+x;	//super keyword is used to refer to parent members.
		System.out.println("sum is "+sum);
		System.out.println("sum1 is "+sum1);	
		System.out.println("QQ default cons called");
	}
	QQ(int x){
		this();
		System.out.println("QQ parameterized Cons called");
	}
}
public class SuperAndThis {

	public static void main(String[] args) {
		QQ q=new QQ(100);	//execution order:- first PP(), then PP(int x), then QQ(), then QQ(int x)
		q.x=300;  
	}

}
