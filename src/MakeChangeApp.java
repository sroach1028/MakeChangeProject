import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int twenties = 0, tens = 0, fives = 0, ones = 0, pennies = 0, nickles = 0, dimes = 0, quarters = 0;
		double totalCost, amountTendered;
		
		System.out.print("Total Cost: ");
		totalCost = kb.nextDouble();
		System.out.println("Amount tendered: ");
		amountTendered = kb.nextDouble();
		
		double amountOwed = amountTendered - totalCost;
		int dollarsBack = (int) Math.floor(amountOwed);
		double centsBack = Math.round((amountOwed - dollarsBack)*100);
		
//		System.out.println(amountOwed);
		System.out.println(dollarsBack);
		System.out.println(centsBack);
		
		if (dollarsBack >0) {
			//call getDollars method
		}
		
		if (centsBack >0 ) {
			//call getCents method
		}
		
		
		do {
			if (dollarsBack%5 !=0) {
				ones++;
				dollarsBack--;
			continue;
			}

			if (dollarsBack%10 != 0) {
				fives++;
				dollarsBack -=5;
				continue;
			}

			else if (dollarsBack % 20 != 0) {
				tens++;
				dollarsBack -= 10;
				continue;
			}
			else if (dollarsBack % 20 ==0) {
				twenties++;
				dollarsBack-=20;
				continue;
			}
			
		} while (dollarsBack>0);
		
		
//		do {
//			while (centsBack%5 != 0) {
//				pennies++;
//				centsBack--;
//			}
//			if (centsBack % 10 != 0) {
//				nickles ++;
//				centsBack-=5;
//			}
//			if(centsBack % 25 !=0) {
//				dimes++;
//			}
//			
//		}while (centsBack > 0 && centsBack % 25 != 0 ); 
		
		
		
		
		System.out.println("Return " + twenties + " twenties, "+
						   tens + " tens, "+ fives + " fives, "+
						   ones + " ones");
		

		
		kb.close();
	}
		
		
		
	
	}



