import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		double totalCost, amountTendered;
		
		System.out.print("Total Cost: ");
		totalCost = kb.nextDouble();
		System.out.println("Amount tendered: ");
		amountTendered = kb.nextDouble();
		double amountOwed = amountTendered - totalCost;
		if (amountTendered < amountOwed) {
			amountTendered = errorMessage(kb);
		}
		
		int dollarsBack = (int) Math.floor(amountOwed);
		double centsBack = Math.round((amountOwed - dollarsBack)*100);
		
		System.out.println("Your change is: ");
		if (dollarsBack >0) {
			getDollarsOwed(dollarsBack);
		}
		
		if (centsBack >0 ) {
			getCentsOwed(centsBack);
		}

		kb.close();
	}
		

	
	//////******************************METHODS******************************************/////
	
	public static void getDollarsOwed(double dollars) {
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
		printMethod(ones, "One", "Ones");
	}
	
	public static void getCentsOwed(double cents) {
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
		
	}
	public static void printMethod(int amountOfEach, String single, String multiple) {
		switch(amountOfEach) {
		case 0:
			break;
		case 1: System.out.println(amountOfEach + " " + single);
			break;
		default: System.out.println(amountOfEach + " " + multiple);
		}
	}
	public static double errorMessage(Scanner kb) {
		System.out.println("That's not enough money. Give me more. ");
		System.out.println("Amount tendered: ");
		return kb.nextDouble();
	}
	
	
}



