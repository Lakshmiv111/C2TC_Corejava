package Com.cg.Framework;

import Banking.SavingAccount;
import Banking.SavingAccount.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	public MMSavingAcc(SavingAccount savingAccount, int accNo, String accNm, float accBal) {
		savingAccount.super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}


	private final float MINBAL=500;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
  
		super(accNo, accNm, accBal, isSalaried);
		
	}  
	
	
	public void bookProduct(float charges) {
		
	}


	@Override
	public String toString() {
		return "MMSavingAcc [MINBAL=" + MINBAL + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	
	

}
