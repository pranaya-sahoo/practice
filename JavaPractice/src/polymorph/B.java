package polymorph;

public class B extends A{
	
	public static void A1()
	{
		System.out.println("Inside B");
	}
	
	public static void main(String[] args)
	{
		A b = new B();
		B b1 = new B();
		b.A1();
		b1.A1();
	}

}
