	class Test 
{
	public void m1(double d)
	{
	System.out.println("int-arg method");
	}
	public void m1(float f)
	{
	System.out.println("float-arg method");
	}
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.m1(10);
		t.m1(10.5f);
		t.m1('a');
		t.m1(10L); 
		t.m1(10.5);
	}

}



