package threaddemo;

public class OnlineBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// here we create object of Account, Deposit, Withdraw Class
		Account a = new Account();
		Deposit d = new Deposit(a);
		Withdraw w = new Withdraw(a);
		// here we start deposit, withdraw thread by using start method of
		// Thread class
		d.start();
		w.start();
	}

}
