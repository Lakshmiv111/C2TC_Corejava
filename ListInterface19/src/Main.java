//Imagine you are about to meet your school friends after long time. You have planned to
//play cards with your friends , but your friends are unaware of how shuffling works in
//playing cards, so write a program in Java to give the shuffled cards as the output to
//proceed your game with fun.

import java.util.*;

public class Main

{

public static void main(String args[])

{

LinkedList<Integer> list=new
LinkedList<Integer>();

Scanner s=new Scanner(System.in);

int num=s.nextInt();

while(num!=0)

{

list.add(s.nextInt());

num--;

}

Collections.shuffle(list);

System.out.println(list);

}

}