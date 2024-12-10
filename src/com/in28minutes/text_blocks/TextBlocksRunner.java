package com.in28minutes.text_blocks;

public class TextBlocksRunner {

	public static void main(String[] args) {
		String str1 = """
				azerty""";
		String str2 = """
				"Line 1"
					"Line 2"
					Line 3
						Line 4
						Line 5
				Line 6""";
		String textBlock = """
				Line 1: %s
				Line 2: %s
				Line 3
				""".formatted("Tasmia", "Tahmid");
		System.out.println(textBlock);
		System.out.println(str2);
	}

}
