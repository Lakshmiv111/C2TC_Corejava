package Com.cg.Framework;

import Banking.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	private static String MINBAL = null;
	private float creditLimit2;


	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		
		super(accNo, accNm, accBal, creditLimit);
	MMCurrentAcc.MINBAL = MINBAL;
	}
	public final float withdraw ;
	


	public void bookProduct(float deliveyCharge) {
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [MINBAL=" + MINBAL + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	

}
