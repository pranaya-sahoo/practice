
public class SimpleClass {
	
	
	public SimpleClass()
	{
		System.out.println("In basic cinstructor");
	}
	
	public SimpleClass(int i)
	{
		this();
		System.out.println(i);
	}
	
	public SimpleClass(String n)
	{
		this(2);
		System.out.println(n);
		
	}
	
	public static void main(String[] args)
	{
		
		
		SimpleClass s = new SimpleClass("Pranaya");
		
	}

	

	
		
	
}
