
package Encapsulation;

public class A {

	private int value; // declare Variable is Private is mandatory

	public void SetValue(int a) {

		this.value = a;
	}

	public int GetValue() {
			
		return value;
	}
}
class B{
	public static void main(String[] args) {
		A obj = new A();
		obj.SetValue(100);
		
		System.out.println(obj.GetValue());
	}
}