package day8.interfaces.instanceofinterface;

public class Jio implements phone{
	public void call() {
		System.out.println("Calling using Jio");
	}

	@Override
	public void sms() {
		System.out.println("Messaging using Jio");

	}
}
