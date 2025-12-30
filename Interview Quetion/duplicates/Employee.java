package duplicates;
import java.util.Scanner;
class Employee {
    
    public static void main(String[] args) {

        Scanner employee1 = new Scanner(System.in);
 //1
        System.out.print("Employee_Id:  ");
        int Employee_Id1 = employee1.nextInt();

        System.out.print("Employee_Name: ");
        String Employee_Name1 = employee1.next();

        System.out.print("Employee_Salary: ");
        int Employee_Salary1 = employee1.nextInt();
//2
        System.out.print("Employee_Id: ");
        int Employee_Id2 = employee1.nextInt();

        System.out.print("Employee_Name: ");
        String Employee_Name2 = employee1.next();

        System.out.print("Employee_Salary: ");
        int Employee_Salary2 = employee1.nextInt();
//3
        System.out.print("Employee_Id: ");
        int Employee_Id3 = employee1.nextInt();

        System.out.print("Employee_Name: ");
        String Employee_Name3 = employee1.next();

        System.out.print("Employee_Salary: ");
        int Employee_Salary3= employee1.nextInt();

        System.out.println("Employee Details ");
        
        System.out.println("Employee_1: "+Employee_Id1+Employee_Name1+Employee_Salary1);
        System.out.println("Employee_2: "+Employee_Id2+Employee_Name2+Employee_Salary2);
        System.out.println("Employee_3: "+Employee_Id3+Employee_Name3+Employee_Salary3);
    }
}
