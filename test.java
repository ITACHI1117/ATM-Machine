import java.util.Scanner;

public class test {
  
	public static void main(String [] args) {

		String username, password ;
		int Transaction;
		int balance = 5000;
		int number = 1101264021;
		String name = "Kuda";
		String bank = name;
		int TaransferPassword = 1111;
		int Tpass = TaransferPassword;
		double x;
		int newAmmount = 1-10000000;
		
		Scanner scanner = new Scanner(System.in);
		
		

		
		
		System.out.println("Enter Ussername");
		username = scanner.next();
		
		System.out.println("Enter password");
		password = scanner.next();
		
		if (username == "joe") {
			System.out.println("Error 404");
		}
		if (password == "1234") {
			System.out.println("Error 404");
		}else {
			System.out.println("ATM Options");
			System.out.println("input a anumber");
			System.out.println("1: Withdraw");
			System.out.println("2: Transfer");
			System.out.println("3: Deposit");
			System.out.println("4: Check balance");
			System.out.println("5: Exit");
			Transaction = scanner.nextInt();
		
			if (Transaction == 1) {
				System.out.println("Withdraw ammount");
				Transaction = scanner.nextInt();
				if (balance < Transaction) {
					System.out.println("Insufficent Balance");
				}else {
					System.out.println("Collect your cash from the atm");
				}
			}else if (Transaction == 2) {
				System.out.println("Transfer ammount");
				Transaction = scanner.nextInt();
				if (balance < Transaction) {
					System.out.println("You dont have enough money in your account to Make this Transaction");
				}else {
					System.out.println("Account Number");
					Transaction = scanner.nextInt();
					System.out.println("Bank Name");
					name = scanner.next();
					if (Transaction == number && name == bank) {
						System.out.println("Bank Name");
						
					}else if(Transaction != number && name != bank) {
						System.out.println("Beneficary Not found");
					}else {
						System.out.println("Transffer password");
						TaransferPassword = scanner.nextInt();
					}if (TaransferPassword == Tpass) {
						System.out.println("Transfer sucessful");
					}else {
						System.out.println("incorrect Password");
					}
					
				}
			}else if (Transaction == 3) {
				System.out.println("Deposit ammount");
				newAmmount = scanner.nextInt();
			}if (newAmmount >= 100) {
				x = newAmmount + balance;
				System.out.println("your new balance is " +x);
			}else if (Transaction == 4) {
				System.out.println("Your account balance is " + balance);
			}else if (Transaction == 5){
				 scanner.close();
			}
		}
		
}
}