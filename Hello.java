import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Hello");
		System.out.println("Enter first number:-");
		int a=scanner.nextInt();
		System.out.println("Enter second number:-");
		int b=scanner.nextInt();
		int c=a+b;
		System.out.println("परिणाम है "+c);
		System.out.println("Enter your name-");
		String name=scanner.next();
		System.out.println("आपका नाम है :- "+ name);
		scanner.close();
	}

}
