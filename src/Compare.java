

public class Compare {
	public static void main(String[] args) {
		String arr1[] = {"apple", "boy","cat"};
		String arr2[] = {"boy", "apple","cat"};
		
		int count = 0;
			for (int i=0; i<arr1.length; i++) {
				for(int k= 0; k<arr2.length; k++) {
					if(arr2[k].equals( arr1[i])) {
						System.out.println(arr2[k] + "Found");
						int ab = arr2.length;
						ab = count++;
						break;
					}
					else {
						continue;
					}
				}	
			}
			if (arr1.length == count) {
				System.out.println("Strings are matched");
			}
			else {
				System.out.println("Strings are not matched");
			}
	}
}