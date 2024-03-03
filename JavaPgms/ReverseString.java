// There are several ways to reverse a string in Java, each with its own advantages and considerations:

// 1. Using StringBuilder:

// This method leverages the StringBuilder class, which is mutable and allows for efficient character manipulation. Here's the code:


public static String reverseString(String str) {
  return new StringBuilder(str).reverse().toString();
}
// Explanation:

// We create a new StringBuilder object from the input string.
// The reverse() method reverses the characters in the StringBuilder.
// Finally, toString() converts the reversed StringBuilder back to a String and returns it.


// 2. Using a loop:

// This approach iterates through the string in reverse order, building a new string character by character.

public static String reverseString(String str) {
  StringBuilder reversed = new StringBuilder();
  for (int i = str.length() - 1; i >= 0; i--) {
    reversed.append(str.charAt(i));
  }
  return reversed.toString();
}

// Explanation:

// We initialize an empty StringBuilder to store the reversed string.
// We iterate through the string in reverse order using a loop (starting from the last index and going down to 0).
// In each iteration, we append the current character to the reversed StringBuilder.
// Finally, we convert the StringBuilder to a String and return it.

  
// 3. Using Java 8 Streams (functional approach):

// Java 8 introduced streams, which provide a concise and functional way to manipulate data. Here's how to reverse a string using streams:

public static String reverseString(String str) {
  return new StringBuilder(str).reverse().toString(); // Equivalent to method 1
  // Or using streams:
  // return str.chars().mapToObj(c -> (char) c)
  //        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
  //        .toString();
}


// Explanation:

// The commented code snippet demonstrates an alternative approach using streams. It converts the string into a stream of characters, maps each character back to a Character object, and then collects them into a StringBuilder in reverse order using a specific collector.
// Choosing the right method:

// If you need efficient string manipulation and modifications, using StringBuilder (method 1) is generally recommended.
// For a more basic iterative approach, the loop method (method 2) is suitable.
// If you're comfortable with Java 8 streams and prefer a functional style, the stream approach (method 3) can be a concise option.


