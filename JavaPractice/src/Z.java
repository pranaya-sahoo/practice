
public class Z extends Y{

	Z(){
		
		System.out.println("Inside class Z constructor");
	}
	
	public void show(int i)
	{
		
		System.out.println("Inside Show method of class Z");
	}
	public static void main(String[] args) {
		Z z = new Z();
		z.show();

	}

}
