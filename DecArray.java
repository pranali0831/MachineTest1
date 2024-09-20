package Com.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecArray {
	public static void main(String[] args) {
		
		List<Student> l= new ArrayList<Student>();
		
		Student s=new Student();
		   s.setRoll(1);
		   s.setName("abc");
		   s.setMarks(80);
		   
		   Student s1=new Student();
		   s1.setRoll(1);
		   s1.setName("pqr");
		   s1.setMarks(80);
		   
		   Student s2=new Student();
		   s2.setRoll(1);
		   s2.setName("xyz");
		   s2.setMarks(80);
		   
		   Student s3=new Student();
		   s3.setRoll(1);
		   s3.setName("abc");
		   s3.setMarks(80);
		   
		   l.add(s);
		   l.add(s2);
		   l.add(s3);
		   
		   
		   
		   System.out.println(l);
		 
		   
		
		
		 
	}

}
