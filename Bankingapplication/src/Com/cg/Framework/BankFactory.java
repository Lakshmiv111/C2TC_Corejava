package Com.cg.Framework;

import Banking.CurrentAcc;
import Banking.SavingAccount.SavingAcc;

public abstract class BankFactory {
	
	public abstract SavingAcc getNewSavingAccount(int AccNo,String accNm,float accBal,boolean isSalaried);
	public abstract CurrentAcc getNewCurrentlAccount(int AccNo,String accNm,float accBal,float creditLimit);

}
