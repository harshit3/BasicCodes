class Shape{
	void rotate(){
		System.out.println("Shape Rotate");
	}
	
	void draw(){
		System.out.println("Shape Draw");
	}
	
}

class Circle extends Shape{
	void draw(){
		System.out.println("Circle Draw");
	}
	
	void radius(){
		System.out.println("Circle Radius");
	}
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("Rectangle Draw");
	}
}

class Square extends Shape{
	void draw(){
		System.out.println("Square Draw");
	}
}

class Game{
	
	void caller(Shape shape){
		shape.draw();
		shape.rotate();
		//Down-casting:- possible when there is up-casting.
		if(shape instanceof Circle){
			Circle circle=(Circle)shape;
			circle.radius();
		}
	}
	
}
public class UpCastingDownCasting {

	public static void main(String[] args) {
		
		
	/*	Here we are breaking DRY principle.So we can use up-casting and down-casting to avoid it.
		Circle circle=new Circle();
		circle.draw();
		circle.rotate();
		circle.radius();
		
		Rectangle rect=new Rectangle();
		rect.draw();
		rect.rotate();
		
		Square square=new Square();
		square.draw();
		square.rotate();	
	*/

	
	/*	Here also our break of DRY principle problem is not solved:-
		//Object of Circle will be created but only common methods of parent and child can be called.
		//Can't call the specific method of child class(Here Radius).So we say that object of child can go to parent. 
		Shape shape=new Circle();  //up-casting(up-casting is possible only if inheritance and overriding)
		shape.draw();	//goes to Shape class, if draw() present then goes to child, if overridden draw() then calls it.
		//shape.radius();	//error because radius() not in Shape.
		shape.rotate();		//goes to Shape class, if rotate() present then goes to child, no overridden method then calls parent version rotate().
	
		Shape shape1=new Square();
		shape1.draw();
		shape1.rotate();	
	*/
		
		Game game=new Game();
		game.caller(new Circle());
		game.caller(new Square());
		game.caller(new Rectangle());		
	}

}
