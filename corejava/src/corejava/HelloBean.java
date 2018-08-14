package corejava;

public class HelloBean 

{
	private HelloBean() 
	{
		System.out.println("HelloBean Default Constructor");
	}
	
	private String message;

	public String getMessage() 
	{
		return message;
		
		
	}

	public void setMessage(String message) {
		this.message = message;
		
		System.out.println("set message method called");
	}
	
	
	
}
