import java.util.Scanner;
public class Bank_Application1 {
	 
		
		public static void main(String [] args) {
			
			Scanner input= new Scanner(System.in);
			int userInput;
			int size=0;
			double [] accountBalances = new double[250];
			String[] accountNames = new String[250];
			
			
			for(;true;) {
			System.out.println("Bank Admin Menu:");
			System.out.println("---------------\n");
			System.out.println("Please enter a menu option: ");
			System.out.println("---------------------------\n");
			System.out.println(" (PRESS 1) To Add Customer To The Bank.");
			System.out.println(" (PRESS 2) To Change Customer Name.");
			System.out.println(" (PRESS 3) To Check Account Balance.");
			System.out.println(" (PRESS 4) To Modify Account Balance.");
			System.out.println(" (PRESS 5) To Check All Account Summary.");
			System.out.println(" (PRESS 0) To Quit From The Application.");
			
			
			userInput= input.nextInt();
					
			if(userInput == 1) {
				System.out.println("Bank Add Customer Menu. ");
				System.out.println("-----------------------\n");
				System.out.println("Please Enter An Account Balance: ");
				double balance = input.nextDouble();
				accountBalances[size]=balance;
				System.out.println("Please Enter Account Name: ");
				input.nextLine();   //buffer Cleanup
				String name = input.nextLine();
				accountNames[size] = name;
				System.out.println("Customer Id is: " + size);
				size=size+1;
				
			}
			
			else if(userInput == 2) {
				System.out.println("Customer Name Change Menu. ");
				System.out.println("--------------------------\n");
				System.out.println("Please Enter Your Customer ID To Change Your Name: ");
				int customer_id = input.nextInt();
				System.out.println("Please Enter New Name: ");
				input.nextLine();      //buffer Cleanup
				accountNames[customer_id]=input.nextLine();
				
				
			}
			
			else if(userInput == 3) {
				System.out.println("Account Balance Check Menu. ");
				System.out.println("---------------------------\n");
				System.out.println("Please Enter Your Customer ID To Check Account Balance: ");
				int customer_id = input.nextInt();
				double balance = accountBalances[customer_id];
				System.out.println("You have $ "+ balance +"in your account. ");
				
			}
			
			else if(userInput == 4) {
				System.out.println("Modify Account Balance Menu. ");
				System.out.println("----------------------------\n");
				System.out.println("Please Enter Your Customer ID To Modify Your Account Balance: ");
				int customer_id = input.nextInt();
				System.out.println("Please Enter Your Updated Account Balance: ");
				accountBalances[customer_id]=input.nextDouble();
				System.out.println("Account Balance Succesfully Updated. ");
				
				
			} 
			
			else if(userInput == 5) {
				System.out.println("All Account Summary Menu. ");
				System.out.println("-------------------------\n");
				double total_balance = 0;
				for(int i = 0; i < size; i++) {
					total_balance = total_balance + accountBalances[i];
					System.out.println(accountNames[i] + " has $" + accountBalances[i] + " in his account. \n");
					
				}
				System.out.println("In total their is &" + total_balance + "in the bank. \n");
			}
			
			else if(userInput == 0) {
				System.exit(0);
			}
			else {
				System.out.println("Error: Invalid Input! PLEASE TRY AGAIN!");
			}
		
		
		}
		}
		
}
