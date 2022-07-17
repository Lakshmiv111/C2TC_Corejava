package Banking;

public class SavingAccount {

	public abstract class SavingAcc extends BankAcc {
		
		public SavingAcc(int accNo, String accNm, float accBal) {
			super(accNo, accNm, accBal);
			// TODO Auto-generated constructor stub
		}

		private boolean isPrime;
		private boolean isSalaried;
		private static final float MINBAL=500;
		
		
		public boolean isPrime() {
			return isPrime;
		}


		public  void isSalaried(boolean isSalaried) {
		
			this.isSalaried=isSalaried;
		}

		public static float withdraw() {;
			return withdraw();
		}



		public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried){

			super(accNo, accNm, accBal);
			this.isSalaried = isSalaried;
		}

				public void withdraw( float accBal) {
			}



				@Override
				public String toString() {
return "SavingAccount [isSalaried=" + isSalaried + ",toString()=" + super.getaccBal() +",getaccBal=" + getaccBal()
		 + ",hashCode()=" + hashCode()+ "]";
				}
				
				
		
				
				

			}

			}


				
				

			}

		

	
