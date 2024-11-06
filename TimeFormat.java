// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// Ive tried not to use an if statement as weve yet to cover it's use cases in class

		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		
		// checkRange will be 1 if hours < 12 and 0 if else
		int checkRange = (hours/12) * (10 * (12-hours) /  (10 * (hours-12) - 1)) * -1;
		
		// uses checkRange's value to ignore the calculation for hours not within current range 
		int formatedHours = hours * (1 - checkRange) + (hours - 12) * checkRange;

		// uses checkRange to only use relevant part of the meridian string
		String meridiem = "AMPM";
		System.out.println(formatedHours + ":" + minutes + " " + meridiem.substring(checkRange * 2, 2 + checkRange*2));
	}
}