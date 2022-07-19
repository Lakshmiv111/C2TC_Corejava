class Adder{ 
	
 static int add1(int a,int b)
 {
 return a+b;
 } 
 static double add(int a,int b)
 {
 return a+b;
 } 
}
class TestOverloading3
{ 
public static void main(String[] args)
{ 
System.out.println(Adder.add1(11,11));
}
}