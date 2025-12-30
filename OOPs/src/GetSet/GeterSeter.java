package GetSet;

public class GeterSeter {

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
		GeterSeter person = new GeterSeter();
		person.setName("Rushi");
		person.setAge(21);
		System.out.println("Name:" + person.getName());
		System.out.println("Age:" + person.getAge());
	}

}