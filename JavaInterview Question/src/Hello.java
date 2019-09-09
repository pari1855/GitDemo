import java.util.Calendar;

public class Hello extends TestDeme.M implements TestDeme {
	int a, b;
	private class b{
		private int a=5;
	}
	public static void main(String[] args) {
		long timeInMillis= Calendar.getInstance().getFirstDayOfWeek();
		Hello obj = new Hello();
		obj.m2();
		obj.m1();
		System.out.println(timeInMillis);
	}
		public static void abc() {
			Hello obj = new Hello();
			int c=obj.a+obj.b;
			System.out.println("c");	
			obj.abc2();
		}
		public void abc2() {
			System.out.println("I am priyanka");
		}
		@Override
		public void m2() {
		System.out.println("I am implemented method of inetrface in class");
			
		}
	}
	interface TestDeme{
	class M {
		public void m1() {
			System.out.println("I am class method inside interface m1");
		}
	}
		public void m2();
}
