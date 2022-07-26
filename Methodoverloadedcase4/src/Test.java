
   class Test
   {
public void m1(int i)
{
	 System.out.println("General Method");
}
public void m1(int...i)
{
	System.out.println("var-arg Method");
}
	public static void main(String[] args)
	{
	Test t = new Test();
	t.m1();
	t.m1(10,20);

	}

}
