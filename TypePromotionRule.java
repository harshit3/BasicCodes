import java.math.BigInteger;

public class TypePromotionRule {

	public static void main(String[] args) {
		//Followings are primitive data type in Java.x & y both will be allocated different memory.
		int x=100;	//Stores value.
		int y=100;
		
		//Followings are wrapper classes.For each primitive data type Java has a wrapper class(ex->Integer is a predefined class.)
		//Here a pool created when p assigned and when q is assigned(same value) it checks if it is in pool.
		//If so it will contain the same address.Range of pool is -127 to 128.
		Integer p=200;	//Stores the reference not value.
		Integer q=200;
		
		//BigInteger is a class used for calculation of very large values(like currency calculations)-.
		//Needs to be imported before use.
		@SuppressWarnings("unused")
		BigInteger bg;
		
		if(x==y){
			System.out.println("Same Value x & y");
		}
		else
			System.out.println("Not Same Value x & y");
		
		//if value of p & q are equal but out of range of the pool then 
		//they will not be store in the pool.Each variable will be assigned a new reference.
		if(p==q){
			System.out.println("Same Reference p & q");
		}
		else 
			System.out.println("Not Same Reference p & q");
		
		
		//intValue()-one of the functions defined in the wrapper class 'Integer'.(for type casting- byteValue(),floatValue(),...)
		if(p.intValue()==q.intValue()){
			System.out.println("Same value p & q");
		}
		else
			System.out.println("Not same value p & q");
		
	

	}

}
