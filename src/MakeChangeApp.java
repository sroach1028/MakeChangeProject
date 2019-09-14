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
		int dollarsBack = (int) Math.floor(amountOwed);
		double centsBack = Math.round((amountOwed - dollarsBack)*100);
		
		
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
			
			else if (dollars % 20 != 0) {
				tens++;
				dollars -= 10;
				continue;
			}
			else if (dollars % 20 ==0) {
				twenties++;
				dollars-=20;
				continue;
			}
			
		} while (dollars>0);
		System.out.println("Return " + twenties + " twenties, "+
				tens + " tens, "+ fives + " fives, "+
				ones + " ones");
	}
	
	public static void getCentsOwed(double cents) {
		int pennies = 0, nickles = 0, dimes = 0, quarters = 0;
		do {
			if (cents % 5 !=0) {
				pennies ++;
				cents--;
				continue;
			}
			else if(cents >= 25) {
				quarters++;
				cents-= 25;
				continue;
			}
			else if (cents % 10 == 0) {
				dimes++;
				cents -=10;
				continue;
			}
			else if (cents % 5 == 0){
				nickles++;
				cents -=5;
				continue;
			}
			
		} while (cents >0);
		System.out.println("Return " + quarters + " quarters, "+
				dimes + " dimes, "+ nickles + " nickles, "+
				pennies + " pennies");
		
	}
	
}



