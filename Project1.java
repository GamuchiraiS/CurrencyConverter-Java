import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiate Scanner class
		Scanner scan = new Scanner(System.in);
		//variables
		double amount;
		int convertF, convertT; 
		/*taking in user input and 
		 * assigning to the appropriate variables
		 */
		System.out.print("Welcome! \nPlease enter an amount: ");
		amount = scan.nextDouble();
		System.out.println("Please select the number for the currency you are converting from: ");
		System.out.println("1. United States Dollar \n2. South African Rand \n3. Euro \n4. Bitcoin");
		convertF = scan.nextInt();
		System.out.println("Please select the number for the currency you are converting to: ");
		System.out.println("1. United States Dollar \n2. South African Rand \n3. Euro \n4. Bitcoin");
		convertT = scan.nextInt();
		//instantiate class 
		CurrencyConverter concur = new CurrencyConverter(amount, convertF, convertT);
		//call method and display the converted amount to user
		System.out.printf("The converted amount = " + "%.2f" , concur.calculateCurrency());
		scan.close(); //close Scanner 
	}

}
