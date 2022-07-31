interface Sayable {

public void say();

}

class Main
{

public static void main(String[] args)

{

Sayable s=() -> { System.out.println("I love jesus"); } ;

s.say();



}
}
