package com.jdc.psp.handler;

public class Handler {

	private Person person;
	int count = 1;

	public Handler() {
		super();
		person = new Person();

	}

	public void useName() {
		try {
			person.setName("Henery");
			System.out.println(person.getName());

		} catch (NullPointerException e) {
			System.out.println("This is NullPointerException");
		}
	}

	// arithmeticException
	public void useAge() {
		try {

			person.setAge(22);
			int age = dividedByZero(person.getAge());
			System.out.println(person.getAge());

		} catch (ArithmeticException a) {
			System.out.println("ArithmeticException because of number can't divided by zero");
		}

	}

	private int dividedByZero(int age) {
		return (age / 0);
	}

	// stackoverflow error
	public void recursive() {
		try {

			if (count > 0) {
				System.out.println("recuresive:" + count);
				count++;
				recursive();
			}

		} catch (StackOverflowError e) {
			System.out.println("This is stackOverflow error cause of recursive");
		}

	}

}
