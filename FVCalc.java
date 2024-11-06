// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		/* ive declared and assigned the variables values in 3 different rows as i feel a single row
		   containing all the convertions and names would be cluttered */

		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);

		// futureValue is calculated within the 2nd print row as i saw no inherent benefit in assigning the calculation to a var before printing
		System.out.println("After " + n + " years, a $" + currentValue + " saved at " + rate + 
							"% will yield " + "$" + (int) (currentValue * Math.pow(rate/100 + 1,(double) n)));
	}
}