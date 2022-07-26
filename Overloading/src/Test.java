 class Test
 {
public void m1(Object o)
{
	System.out.println("Object version");
}
 public void m1(String s)
 {
	 System.out.println("String version");
 }
	public static void main(String[] args)
	{
	Test t = new Test();
	t.m1(new Object());
	t.m1("durga");
	t.m1(null);

	}

}
