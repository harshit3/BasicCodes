//Only public modifier allowed-

//enum CoffeeSize{SMALL,LARGE,MEDIUM}	//Outside the class

//enum constructor is never invoked directly.It is done as- Constant(Argument)
enum CoffeeSize{
	SMALL(0),MEDIUM(1){
		//Method overriding-
		@Override
		String offers(){
			return "1 OFFER";
	}
	},LARGE(2);	//Constructor calls
	int index;
	CoffeeSize(int index){	//Constructor
		this.index=index;
	}
	int getIndex(){	//Method
		return index;
	}
	String offers(){	//Method
		return "NO OFFER";
	}
}

class Coffee{
	CoffeeSize size;
	enum LidType{A,B,C};
	LidType lid;
}
public class EnumDemo {	
	
	public static void main(String[] args) {
			Coffee e=new Coffee();
			e.size=CoffeeSize.LARGE;
			e.lid=Coffee.LidType.A;
			System.out.println("Size is:-"+e.size+" & LidType is:-"+e.lid);
			//System.out.println(CoffeeSize.LARGE.getIndex());
			for(CoffeeSize cs:CoffeeSize.values()){
				System.out.println(cs.index+" "+cs+"   "+cs.offers());
			}
	}

}
