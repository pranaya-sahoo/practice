
public class errorHandling {

	void show()
	{
		try
		{
		   throw new Error();	
		}
		
		catch(Error er)
		{
		   System.out.println("Got it");	
		}
	}
	
	void display () 
	{
	    throw new Error();
		
	}
	
	
	

	public static void main(String[] args) {
		errorHandling e = new errorHandling();
		
		e.show();
		
		e.display();
		
				
       
	}

}
