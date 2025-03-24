package task;
// Exception handling using try catch finally 
public class ExceptionHandling {
	public static void main(String args[]) {
		//System.out.println("hi hello vanakam ");
		try {
		System.out.println(12/0);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("/n hi hello ");
		}
		
		System.out.println("hi hello vanakam ");
	}
}
