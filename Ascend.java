// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		double random1 = Math.random() * num;
		int random4 = (int)random1;
		double random2 = Math.random() * num;
		int random5 = (int)random2;
		double random3 = Math.random() * num;
		int random6 = (int)random3;
		String sp = " ";
		int min1 = Math.min(random4,random5);
		int min2 = Math.min(random5,random6);
		int min3 = Math.min(min1,min2);
		int max1 = Math.max(random4,random5);
		int max2 = Math.max(random5,random6);
		int max3 = Math.max(max1,max2);
		int average = random4 + random5 + random6 - max3 - min3;
		    System.out.println(random4 + sp + random5 + 
			sp + random6);
		    System.out.println(min3 + sp + average + sp + max3);

		// Replace this comment with your code
	}
}
