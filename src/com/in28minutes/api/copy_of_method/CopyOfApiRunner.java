package com.in28minutes.api.copy_of_method;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Namo");
		names.add("Tahmid");
		names.add("Tasmia");
		List<String> copyOfNames = List.copyOf(names);

		doNotChange(copyOfNames);
		System.out.println(copyOfNames);
	}

	private static void doNotChange(List<String> names) {
		names.add("ShouldNotBeAllowed");
	}

}
