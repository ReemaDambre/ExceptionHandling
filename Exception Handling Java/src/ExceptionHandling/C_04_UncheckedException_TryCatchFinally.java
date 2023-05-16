package ExceptionHandling;

public class C_04_UncheckedException_TryCatchFinally {

	public static void main(String[] args) {
		try {
			int x = 10/0;
			System.out.println("Division result is : "+ x);
		}
		catch (Exception e) {
			System.out.println("Something went wrong .please check the exception ." +e.getMessage());
			
			
		}
		finally {
			System.out.println("This is finally block.");
			
		}
		
		
	}

}
