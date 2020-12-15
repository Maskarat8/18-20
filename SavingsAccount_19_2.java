package conko1;

public class SavingsAccount_19_2 extends Account{
	public SavingsAccount_19_2(int id, double balance){
		super(id, balance);
	}
	public void withdraw(double draw) {
		if(balance >= draw) {
			balance -= draw;
		}
	
	}
	public String toString() {
		return super.toString() + "Savings acc";
	}
}
