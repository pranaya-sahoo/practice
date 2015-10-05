package collectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class usingIterator {
	
	public static void main(String[] args) {
		Student s1 = new Student(100, 18,"Pranaya");
		Student s2 = new Student(101, 19, "Jack");
		Student s3 = new Student(102, 20, "Tom");
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		/*for(Student ss:al)
		{
			System.out.println(ss.roll+" "+ss.age+" "+ss.Name);
		}*/
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			Student ss = (Student) itr.next();
			System.out.println(ss.roll+" "+ss.age+" "+ss.Name);
			
		}
		
			
	}

}
