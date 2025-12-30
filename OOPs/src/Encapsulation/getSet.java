package Encapsulation;

public class getSet {

	private String name;
	private int password;

	public String getUsername() {

		return name;
	}

	public int getPassword() {

		return password;
	}

	public void setUsername(String name) {
        this.name = name;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public static void main(String[] args) {

		getSet obj = new getSet();
		obj.setUsername("Sanket");
		obj.setPassword(12345);
		
		System.out.println("Username :"+obj.getUsername());
		System.out.println("Password :"+obj.getPassword());
	}

}
