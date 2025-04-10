package git_60;
import java.util.*;
public class student_data {
    public static void main(String srg[])
    {
    	Scanner sc=new Scanner(System.in);
    	String name,surname;
    	int age,RollNo;
    	System.out.println("Enter your first name : ");
    	name=sc.nextLine();
    	System.out.println("Enter your Last name : ");
    	surname=sc.nextLine();
    	System.out.println("Enter your age : ");
    	age=sc.nextInt();
        System.out.println("Enter your RollNo : ");
    	RollNo=sc.nextInt();
    	System.out.println("My name is "+name+" "+surname+" "+"I am "+age+" Years old.My RollNo. is "+RollNo);
    }
}
