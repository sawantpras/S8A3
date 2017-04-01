package threaddemo;
//Deposit class extends Thread class 
public class Deposit extends Thread {
	Account a;
//constructor takes parameter of Account class object
	Deposit(Account a) {
		this.a = a;
	}

	// run method call depWith method of Account class
	public void run() {
		a.depWith(3, 2000, '+');
	}
}
