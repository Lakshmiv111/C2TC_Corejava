package com.cg.client;
import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class client {
	public static void main (String args[]){
		BankFactory bf=new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(7578493,"SAVING",50000,true);
		CurrentAcc ca=new MMCurrentAcc(7578493,"Saving",40000,4000);
		sa.withdraw(sa.getAccBal());
		ca.withdraw(ca.getCreditLimit());
	}

}
