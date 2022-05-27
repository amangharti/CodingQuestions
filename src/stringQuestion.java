import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class stringQuestion {
	
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("apple", "boy", "cat"));
		System.out.println("1st string" + a);
		ArrayList<String> b = new ArrayList<String>(Arrays.asList("boy", "apple", "cat"));
		System.out.println("2nd string" + b);
		
		Collections.sort(a);
		Collections.sort(b);
		
		if(a.equals(b)) {
			System.out.println("Strings are matched");
		}
		else {
			System.out.println("Strings are not matched");
		}
	}
	
	
}
