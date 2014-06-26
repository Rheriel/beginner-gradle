package hello;

public class HelloWorld {
	public static void main(String[] args) {
		// Added to test how gradle handles dependencies.
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);

		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}
}
