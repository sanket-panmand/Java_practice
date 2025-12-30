package polymorphism;

public class CompileTime_poly {            //MethodOverloading
    
    // 1 parameter
  void show(int num1)
  {
      System.out.println("First : " + num1);
  }

  // 2 parameter
  int show(int num1, int num2)
  {
      System.out.println("First : " + num1 + "  Second : " + num2);
      return 0;
  }

  
  public static void main(String[] args)
  {
	  CompileTime_poly obj = new CompileTime_poly();
    
        // 1st show function
      obj.show(3); 
    
        // 2nd show function
      obj.show(4, 5); 
  }
}
