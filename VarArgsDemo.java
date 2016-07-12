class Sum{
	/*
	Here calcSum() is overloaded with 'different' number of 'same' type of arguments.So we can use VarArgs.  
	int calcSum(int x,int y){
		return x+y;
	}
	
	int calcSum(int x,int y,int z){
		return x+y+z;		
	}
	
	int calcSum(int x,int y,int z,int a){
		return x+y+z+a;
	}*/
	
	//Using VarArgs(Variable Arity)-
	//We can pass any number of arguments(including 0).
		public int calcSum(int ...x){
			int sum=0;
			for(int y:x){
				sum=sum+y;
			}
			return sum;
		}
	//A method can have only one Var-Arg method
	//If more than one parameters, var-arg parameter must be at the last.
}
public class VarArgsDemo {
		
	public static void main(String[] args) {

		Sum sum=new Sum();
		System.out.println(sum.calcSum());
		System.out.println(sum.calcSum(2, 5));
		System.out.println(sum.calcSum(1, 5, 3));
		System.out.println(sum.calcSum(0, 2, 34, 6));
	}

}
