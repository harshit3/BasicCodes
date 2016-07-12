//Following is also a composition.
class EE{
	void print(){
		//When we try to change the value of 'k' anywhere then it will be treated as 'effectively final'(from Java8) if
		//it is used inside the inner class otherwise normal local variable. 
		int k=100;
		//Object of this class can be created inside this method because its scope is only in this method.
		class V{
			void show(){
				//When we are using the value of k here a copy of is sent to the heap.
				//Java ha no way to synchronization between this copy at heap and local variable k. 
				System.out.println("V show..."+k);
			}
		}
		
		//k++;
	}
}
public class MethodLocalInnerClass {

	public static void main(String[] args) {
		

	}

}

//Object Creation Starts in Stack(in main() method) but is created and stored inside Heap and reference of it is in stack.