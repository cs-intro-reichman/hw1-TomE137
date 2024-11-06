// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String addedZero = "";

		if (minutes<10) {
			addedZero = "0";			
		}

		if (hours < 12) {
			System.out.println(hours + ":" + addedZero + minutes + " AM");
		}		
		else {
			// (int) (hours-1)/12 will output 0 if hours is 12 and 1 if hours > 12 thus preventing 0:xx pm for 12 without adding another if
			System.out.println(hours-12*((int) (hours-1)/12) + ":" + addedZero + minutes + " PM");
		}
	}
}