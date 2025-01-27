package git_60;
import java.util.*;

class Student{
	String firstName;
	String surname;
	int rollNo;
	
	Student(String fname,String sname,int rNo){
		firstName=fname;
		surname=sname;
		rollNo=rNo;
	}
}
public class student_data {
    public static void main(String srg[])
    {
    	Scanner sc=new Scanner(System.in);
    	String name,surname;
    	int rollNo;
    	
    	System.out.println("Enter your first name : ");
    	name=sc.nextLine();
    	System.out.println("Enter your Last name : ");
    	surname=sc.nextLine();
    	System.out.println("Enter your roll number : ");
    	rollNo=sc.nextInt();
    	Student student=new Student(name,surname,rollNo);
    	System.out.println("My name is "+name+" "+surname+" "+"My roll no is "+age);
    }
}
