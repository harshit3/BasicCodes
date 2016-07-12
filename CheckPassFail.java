import java.util.Scanner;

public class CheckPassFail {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value for mark:-");
		int mark=scanner.nextInt();
		scanner.close();
		System.out.println("Mark is "+mark);
		
		if(mark>=50)
			System.out.println("PASS");
		else
			System.out.println("FAIL");
		
		System.out.println("DONE");
		
	}

}
