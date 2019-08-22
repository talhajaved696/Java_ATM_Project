import java.io.IOException;
import java.util.Map.Entry;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionsMenu extends Account {
	Scanner menuInput = new Scanner(System.in);
	int selection;
	DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	public void getLogin() throws IOException{
		int x = 1;
		
		do {
			try {
				data.put(9876543, 9876);
				data.put(8989898, 1890);
				data.put(7989898, 1897);
				
				System.out.println("\t*** Welcome to the ATM Project ***");
				System.out.print("Enter your Customer Number: ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.print("Enter your PIN number: ");
				setPinNumber(menuInput.nextInt());
			}catch(Exception e) {
				System.out.println("\n"+"Invalid ! Only Numbers");
				x = 2;
				
			}
			for(Entry<Integer, Integer> entry : data.entrySet()) {
				if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n"+"Wrong Customer or Pin Number. Try Again"+"\n");	
		}while(x==1);
	}
	public void getAccountType() {
		System.out.println("Select the Account you want to access: ");
		System.out.println("1 - Checking Account");
		System.out.println("2 - Saving Account");
		System.out.println("3 - Exit");
		System.out.println("Choice: ");
		
		selection = menuInput.nextInt();
		
		switch (selection) {
		case 1:
			getC();
			break;
		case 2:
			getS();
		case 3:
			System.out.println("Thank you for using this ATM, bye.");
			break;
		default:
			System.out.println("Invalid Choice ! Try Again");
			getAccountType();
		}}
		
		public void getC(){
			System.out.println("Checking Account: ");
			System.out.println("1 - View Balance");
			System.out.println("2 - Withdraw Funds");
			System.out.println("3 - Deposit Funds");
			System.out.println("4 - Exit");
			System.out.println("Choice :");

			selection = menuInput.nextInt();
			

			switch (selection) {
			case 1:
				System.out.println("Checking Account Balance: " + moneyFormat.format(getBalance())+"\n");
				getAccountType();
				break;
			case 2:
				getWithdraw();
				getAccountType();
				break;
			case 3:
				getDeposit();
				getAccountType();
				break;
			case 4:
				System.out.println("Thank you for using this ATM, bye.");
				break;	
			default:
				System.out.println("Invalid Choice ! Try Again");
				getC();
			}
			}
		public void getS(){
			System.out.println("Saving Account: ");
			System.out.println("1 - View Balance");
			System.out.println("2 - Withdraw Funds");
			System.out.println("3 - Deposit Funds");
			System.out.println("4 - Exit");
			System.out.println("Choice :");

			selection = menuInput.nextInt();
			

			switch (selection) {
			case 1:
				System.out.println("Saving Account Balance: " + moneyFormat.format(getSBalance()));
				getAccountType();
				break;
			case 2:
				getSWithdraw();
				getAccountType();
				break;
			case 3:
				getSDeposit();
				getAccountType();
				break;
			case 4:
				System.out.println("Thank you for using this ATM, bye.");
				break;	
			default:
				System.out.println("Invalid Choice ! Try Again");
				getS();
			}
			}

}
		
		
		
		
	

