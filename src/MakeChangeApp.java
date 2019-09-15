import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		double totalCost = getCost(kb); 
		double amountTendered = getAmountTendered(kb);
		double amountOwed = amountTendered - totalCost;
		
		if (amountTendered == totalCost) {
			exactMessaage();
		}
		else if (amountTendered < totalCost) {
			errorMessage(kb);
		}
		else {
		makeChange(amountOwed);
		}
		
		kb.close();
	}  //end of main
		

	
	//////******************************METHODS******************************************/////
	
	public static double getCost(Scanner kb) {            // gets total cost from the user as input
		System.out.print("Total Cost: ");
		return kb.nextDouble();
	} // end getCost
	//**************************************************************************************************************//
	
	public static double getAmountTendered(Scanner kb) {  //gets amount tendered from user as input
		System.out.print("Amount Tendered: ");
		return kb.nextDouble();
	} // end getAmountTendered
	//*************************************************************************************************************//
	
	public static void exactMessaage() {      //prints message if amount tendered exactly matches total cost
		System.out.println("Wow, that's the exact amount owed. You should know, starting today, I also accept tips, although it's against company policy. "
				+ "			\n...But I already gave my two weeks so it's fine. My boss has been riding me and I just can't take the politics. "
				+ "			\nCan you believe I had to come in on Christmas? Then in April they cut my hours to part-time and stopped offering stock options. So yeah, tips are great. "
				+ "			\n...What? Oh, yes, you are free to go. Take me with you?");
	} // end exactMessage
	//*************************************************************************************************************//
	
	public static void errorMessage(Scanner kb) { 				// prints error message if amount tendered is less than the total cost
		System.out.println("That's not enough. Come back when you have more money. ");
	} // end errorMessage
	//*************************************************************************************************************//
	
	public static void makeChange(double amountOwed) { 		// takes total amount owed to the user, separates dollars and cents and passes them to getDollarsOwed and getCentsOwed
		int dollarsBack = (int) Math.floor(amountOwed);
		int centsBack = (int) Math.round((amountOwed - dollarsBack)*100);
		
		System.out.println("Your change is: ");
		
		if (dollarsBack >0) {
			getDollarsOwed(dollarsBack);
		}
		if (centsBack >0 ) {
			getCentsOwed(centsBack);
		}
	} // end makeChange
	//*************************************************************************************************************//
	
	public static void getDollarsOwed(double dollars) {  		// takes just the dollar amount from makeChange, figures amount of each denomination due back to the user and passes to printMethod
		int twenties = 0, tens = 0, fives = 0, ones = 0; 
		
		do {
			if (dollars%5 !=0) {
				ones++;
				dollars--;
				continue;
			}
			
			if (dollars%10 != 0) {
				fives++;
				dollars -=5;
				continue;
			}
			
			if (dollars % 20 != 0) {
				tens++;
				dollars -= 10;
				continue;
			}
			if (dollars % 20 ==0) {
				twenties++;
				dollars-=20;
				continue;
			}
			
		} while (dollars>0);
		
		printMethod(twenties, "Twenty", "Twenties");
		printMethod(tens, "Ten", "Tens");
		printMethod(fives, "Five", "Fives");
		printMethod(ones, "One Dollar Bill", "Ones");
	
	} // end getDollarsOwed
	//*************************************************************************************************************//
	
	public static void getCentsOwed(double cents) {				// takes just the cents from makeChange, figures the amount of each denomination due back to the user, and passes to printMethod
		int pennies = 0, nickles = 0, dimes = 0, quarters = 0;
		
		do {
			if (cents % 5 !=0) {
				pennies ++;
				cents--;
				continue;
			}
			
			if(cents >= 25) {
				quarters++;
				cents-= 25;
				continue;
			}
			
			if (cents % 10 == 0) {
				dimes++;
				cents -=10;
				continue;
			}
			if (cents % 5 == 0){
				nickles++;
				cents -=5;
				continue;
			}
			
		} while (cents >0);
		printMethod(quarters, "Quarter", "Quarters");
		printMethod(dimes, "Dime", "Dimes");
		printMethod(nickles, "Nickle", "Nickles");
		printMethod(pennies, "Penny", "Pennies");
		
	}//end getCentsOwed
	//*************************************************************************************************************//
	
	public static void printMethod(int amountOfEach, String single, String multiple) {		// takes amounts from getDollarsOwed and getCentsOwed, and outputs each
		switch(amountOfEach) {
		case 0:
			break;
		case 1: System.out.println(amountOfEach + " " + single);
			break;
		default: System.out.println(amountOfEach + " " + multiple);
		}
	} // end printMethod

//*****************************End Methods***********************//	

} //end MakeChangeApp Class



