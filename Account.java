import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	private int cnumber;
	private int pnumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");

	public void setCustomerNumber(int cnumber) {
		this.cnumber = cnumber;
		
	}
	public int getCustomerNumber() {
		return cnumber;
	}
	public void setPinNumber(int pnumber) {
		this.pnumber = pnumber;
		
	}
	public int getPinNumber() {
		return pnumber;
	}
	public double getBalance() {
		return checkingBalance;
	}
	public double getSBalance() {
		return savingBalance;
	}
	public void calCWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		
	}
	public void calSWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
	}
	public void calCDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
	}
	public void calSDeposit(double amount) {
		savingBalance = (savingBalance + amount);
	}
	public void getWithdraw() {
		System.out.println("Checking Amount Balance : "+moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to withdraw from Checking Account: ");
		double amount = input.nextInt();
		
		if((checkingBalance - amount)>=0) {
			calCWithdraw(amount);
			System.out.println("New Checking Account Balance: "+ moneyFormat.format(checkingBalance));
			}else {
				System.out.println("Balance can not be negative.");
			}
	}
	public void getSWithdraw() {
		System.out.println("Saving Amount Balance : "+moneyFormat.format(savingBalance));
		System.out.print("Amount you want to withdraw from Saving Account: ");
		double amount = input.nextInt();
		
		if((savingBalance - amount)>=0) {
			calSWithdraw(amount);
			System.out.println("New Saving Account Balance: "+ moneyFormat.format(savingBalance));
			}else {
				System.out.println("Balance can not be negative.");
			}
	}
	public void getDeposit() {
		System.out.println("Checking Amount Balance : "+moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to deposit to Checking Account: ");
		double amount = input.nextInt();
		
		if((checkingBalance + amount)>=0) {
			calCDeposit(amount);
			System.out.println("New Checking Account Balance: "+ moneyFormat.format(checkingBalance));
			}else {
				System.out.println("Balance can not be negative.");
			}
	}
	public void getSDeposit() {
		System.out.println("Saving Amount Balance : "+moneyFormat.format(savingBalance));
		System.out.print("Amount you want to deposit to Saving Account: ");
		double amount = input.nextInt();
		
		if((savingBalance + amount)>=0) {
			calSDeposit(amount);
			System.out.println("New Saving Account Balance: "+ moneyFormat.format(savingBalance));
			}else {
				System.out.println("Balance can not be negative.");
			}
	}
	
	
}
