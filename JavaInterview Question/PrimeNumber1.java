//For Prime Number
package JavaProgramsInterview;

public class PrimeNumber1 {
public static void main(String[] args) {
	int num=3, flag=0;
	if(num==3) {
		System.out.println("Number is prime number");
	}
	else {
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			flag=1;
		}
		}
	}
	if(flag==1) {
		System.out.println(num+" Number is not Prime number");
	}
	else{
		System.out.println(num+" Number is a prime number");
	}
	}
}