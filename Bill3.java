// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0], name2 = args[1], name3 = args[2];
		int price = Integer.valueOf(args[3]);
		System.out.println("Dear " + name3 + ", " + name2 + " and " + name1 + 
							": pay " + Math.ceil((double) price/3) + " Shekels each.");   
	}
}
