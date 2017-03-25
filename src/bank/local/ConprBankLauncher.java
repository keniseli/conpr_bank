package bank.local;

import bank.Client;

/**
 * Launcher for the ConprBank.
 */
public class ConprBankLauncher {
	public static void main(String[] args) {
		Client.main(new String[]{ConprBankDriver.class.getName()});
	}
}
  