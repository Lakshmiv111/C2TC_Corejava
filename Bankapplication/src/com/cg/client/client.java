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
		SavingAcc sa=new MMSavingAcc(12345,"SAVING",50000,true);
		CurrentAcc ca=new MMCurrentAcc(12345,"Saving",40000,2000);
		sa.withdraw(sa.getAccBal());
		ca.withdraw(ca.getCreditLimit());
	}

}
