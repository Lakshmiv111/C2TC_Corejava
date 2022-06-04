package Com.aitvariables;

public class Abc	
	{
		int a = 10; //instance variable
		static int b = 20; //static variable
	
	public static void main(String[] args)
	{
		Abc obj1=new Abc();
	
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		
		obj1.a = 1000;
		obj1.b = 2000;
		
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		
		Abc obj2=new Abc();
		
		System.out.println(obj2.a);
		System.out.println(obj2.b);		
		

	}

}
