package com.in28minutes.type_inferences;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {
		var names1 = List.of("Namo", "Nafise");
		var names2 = List.of("Tasmia", "Tahmid");

		final var names = List.of(names1, names2);

		names.stream().forEach(System.out::println);

		for (var name : names1) {
			System.out.println(name);
		}

		var filter = List.of("Namo", "Tasmia", "Tahmid").stream().filter(s -> s.length() < 5);
		filter.forEach(System.out::println);

	}

}
