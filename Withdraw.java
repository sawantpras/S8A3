package threaddemo;
//Withdraw class extends Thread class
public class Withdraw extends Thread {
	Account a;
	//constructor takes parameter of Account class object
	Withdraw(Account a) {
		this.a = a;
	}
	//run method call depWith method of Account classF
	public void run() {
		a.depWith(4, 3000, '-');
	}
}
