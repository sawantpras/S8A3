package threaddemo;

public class Account {

	double balance = 2000;

	// here we make depWith method synchronized, at a time only one thread use
	// this method
	//if we don't use synchronized, both thread executes simultaneously. 
	synchronized public void depWith(int n, double amt, char ch) {
		// depend upon character +/- balance is calculated
		if (ch == '+') {
			for (int i = 0; i < n; i++) {
				balance += amt;
			}
		}
		if (ch == '-') {
			for (int i = 0; i < n; i++) {
				balance -= amt;
			}
		}
		if (ch == '+')
			System.out.println("Final Balance= " + balance);
		if (ch == '-')
			System.out.println("Final Balance after Withdraw= " + balance);
	}
}
