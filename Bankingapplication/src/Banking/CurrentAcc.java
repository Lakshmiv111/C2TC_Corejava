package Banking;

public abstract class CurrentAcc extends BankAcc {
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit ) {
		
	
		super(accNo, accNm,accBal);
	}
	
	

	public float withdraw() {
		return withdraw();
	}


	public void bookProduct(float deliveyCharge) {
		
	}

	@Override
	public String toString() {
		String withdraw = null;
		return "CurrentAcc [withdraw=" + withdraw + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
