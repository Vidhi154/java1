class pen{

	String color;
	String type;

	public void move(){
	System.out.println("writing...");
	}
}

public class oops {
	public static void main(String[] args){

		pen p1 = new pen();
		p1.color="blue";
		p1.type="over";
		p1.move();
	}
}