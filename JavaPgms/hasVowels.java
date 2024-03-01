public static boolean hasVowels(String str) {
Set<Character> vowels = new HashSet<>();
vowels.add('a');
vowels.add('e');
vowels.add('i');
vowels.add('o');
vowels.add('u');

	for (char c : str.toLowerCase().toCharArray()) {
	if (vowels.contains(c)) {
	return true;
				}
	}

	return false;
}
