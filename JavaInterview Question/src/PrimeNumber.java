
public class PrimeNumber {

	public static void main(String[] args) {
		int num = 101,flag=0;
		if (num == 3) {
			System.out.println(num + " is a prime number");
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not a prime number");
					flag=1;
					break;
				} 
			}
			if(flag==0) {
					System.out.println(num + " is  prime Number");
				}
			}
		}
	}
