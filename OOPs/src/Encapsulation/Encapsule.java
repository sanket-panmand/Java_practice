package Encapsulation;

public class Encapsule {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Encapsule person = new Encapsule();
		person.setName("Sanket");
		person.setAge(22);
		System.out.println("Name:" + person.getName());
		System.out.println("Age:" + person.getAge());
	}

}

//public class Encapsule
//{
//	private String name;
//	private int age;
//	
//	public String getName() {
//		return name;
//	}
//	public int getAge() {
//		return age;
//	}
//	
//	public void setName(String name) {
//		this.name= name;
//	}
//	public void setAge(int age) {
//		this.age=age;
//	}
//	
//	public static void main(String argu[]) {
//		Encapsule obj = new Encapsule();
//		obj.setName("abc");
//		obj.setAge(22);
//		System.out.println("Name:" +obj.getName());
//		System.out.println("Age:" +obj.getAge());
//	}
//}