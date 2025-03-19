package task;
public class oops {
	public static void main(String args[]) {
		Sri obj = new Sri() {
				
			 public void name() {
				System.out.println("sri ganesh");
			}
		};	 
		obj.name();
		obj.mark();
		}
	

}
  abstract class Sri{
	 public abstract void name();
	 public void mark()
	 {
		 System.out.println("Mark : 81%");
	 }
}
  
  
  interface Ganesh{
	  public void name();
	  public void mark();
 }
