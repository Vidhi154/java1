class pen{

	String color;
	String type;

	public void move(){
	System.out.println("writing...");
	}
	public void write(){
		System.out.println(this.color);
	}
}

class Student{
	String name;
	int age;

	public void nameinfo(){
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

public class oops {
	public static void main(String[] args){
		Student s1 = new Student();
		s1.name="vidhi yadav";
		s1.age=19;

		Student s2 = new Student();
		s2.name="disha yadav";
		s2.age=14;

		String stu1 =s1.nameinfo();
		String stu2 =s2.nameinfo();

		System.out.println("first student details are :-",stu1);
		System.out.println("second student detalis are :-",stu2);






		// pen p1 = new pen();
		// p1.color="blue";
		// p1.type="over";
		// p1.move();

		// pen p2 =new pen();
		// p2.color="green";
		// p2.type="loweer";
		// p2.write();
		// p1.write(); 
	}
}