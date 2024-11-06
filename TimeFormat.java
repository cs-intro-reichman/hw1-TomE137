// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// Ive tried not to use an if statement as weve yet to cover it's use cases in class

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
			System.out.println(hours-12 + ":" + addedZero + minutes + " PM");
		}
	}
}