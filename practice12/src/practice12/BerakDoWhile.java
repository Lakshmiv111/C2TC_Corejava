package practice12;

public class BerakDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do {
			if(i==5) {
				i++;
				break;
			
			}
			System.out.println(i);
			i++;
		}while(i<=10);
		System.out.println(i);

	}}


