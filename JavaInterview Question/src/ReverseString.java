
public class ReverseString {

	/*
	 * public static void main(String[] args) { String s="Priyanka"; int
	 * len=s.length(); for(int i=len-1;i>=0;i--) { System.out.print(s.charAt(i)); }
	 */

// 2. Different Method Using Char[] Array
	/*public static void main(String[] args) {
		String a = "My name is priyanka";
		char[] b = a.toCharArray();
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i]);
		}

	}*/
	
// 3. To Reverse using String Builder.
	public static void main(String[] args) {
		String s= "My name is Ritika";
		StringBuilder sb= new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
	}
}
