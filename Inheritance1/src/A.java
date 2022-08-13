
public class A 
{
 public void sum()
 {
	 System.out.println("sum method");
 }
 }
  class B extends A
  {
	  public void sum1()
	  {
		  System.out.println("sum1 method");
	  }
	  }
  class inputdata
  {
	public static void main(String[] args)
	{
		B b=new B();
		b.sum(); b.sum1();
		
		
	}
	
}
