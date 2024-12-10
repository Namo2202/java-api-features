package com.in28minutes.records;

public class RecordsRunner {

	record Person(String name, String email, String phoneNumber) {

		static int number;
		Person {
			if (name == null)
				throw new IllegalArgumentException("name is null");
		}

		public String name() {
			System.out.println("Do something");
			return name;
		}
	}

	public static void main(String[] args) {
		Person person = new Person("Namo", "nafise@gmail.com", "0684722849");
		System.out.println(person.name());
	}

}
