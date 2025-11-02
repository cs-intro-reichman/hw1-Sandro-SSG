// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int a = Integer.parseInt(args[0]);
		int b = a/100;
		int c = (a - (b * 100)) / 10;
		int d = a - (b * 100) - (c * 10); 
		    System.out.println(b +" hundreds, " + c + " tens, and " + d + " ones.");
	}
}
