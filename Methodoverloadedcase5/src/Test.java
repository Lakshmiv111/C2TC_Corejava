
 class Test
 {
	 public void m1(int i,float f)
	 {
		 System.out.println("int-float version");
	 }
public void m1(float f, int i)
{
	System.out.print("float-int version");
}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1(10,10.5f);
		t.m1(10.5f,10);
        
	}

}
//t.m1(10,10); compiler error
 //t.m1(10.5f, 10.5f);  compiler error