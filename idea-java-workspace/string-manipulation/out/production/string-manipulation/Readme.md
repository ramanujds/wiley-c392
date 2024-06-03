### The String Class:

- The `String` class in Java represents a sequence of characters.
- Strings in Java are immutable, meaning their values cannot be changed after they are created. This immutability ensures thread safety and allows strings to be used as constants.
- Strings are widely used for representing text-based data such as names, addresses, and messages.
- Strings can be created using string literals (e.g., `"Hello"`) or by calling the `String` class constructor.

Example:

```java
String str1 = "Hello";
String str2 = new String("World");
```

### Important Facts About Strings and Memory:

- Strings in Java are stored in a special area of memory called the "string pool".
- String literals (e.g., `"Hello"`) are automatically interned, meaning that the JVM maintains a single copy of each distinct string literal in the string pool. This reduces memory usage and improves performance.
- String objects created using the `new` keyword are not interned and are stored separately in the heap memory.
- Concatenating strings using the `+` operator creates new string objects, which can lead to performance overhead if done excessively.

### Important Methods in the String Class:

- `length()`: Returns the length of the string.
- `charAt(int index)`: Returns the character at the specified index.
- `substring(int beginIndex)`: Returns a substring starting from the specified index.
- `substring(int beginIndex, int endIndex)`: Returns a substring within the specified range.
- `equals(Object obj)`: Compares the string to the specified object for equality.
- `compareTo(String anotherString)`: Compares two strings lexicographically.
- `indexOf(String str)`: Returns the index of the first occurrence of the specified substring.
- `toUpperCase()`, `toLowerCase()`: Converts the string to uppercase or lowercase.

Example:

```java
String str = "Hello World";
System.out.println(str.length()); // Output: 11
System.out.println(str.charAt(6)); // Output: W
System.out.println(str.substring(6)); // Output: World
System.out.println(str.equals("Hello")); // Output: false
System.out.println(str.indexOf("World")); // Output: 6
System.out.println(str.toUpperCase()); // Output: HELLO WORLD
```

### The StringBuffer and StringBuilder Classes:

- Both `StringBuffer` and `StringBuilder` are mutable counterparts of the `String` class, allowing modification of their content without creating new objects.
- `StringBuffer` is thread-safe, meaning it's synchronized and suitable for use in multi-threaded environments.
- `StringBuilder` is not thread-safe but provides better performance than `StringBuffer` in single-threaded scenarios due to lack of synchronization overhead.

### Important Methods in the StringBuffer and StringBuilder Classes:

- `append(String str)`: Appends the specified string to the end of the sequence.
- `insert(int offset, String str)`: Inserts the specified string into the sequence at the specified position.
- `delete(int start, int end)`: Deletes characters from the sequence.
- `reverse()`: Reverses the characters in the sequence.

Example:

```java
StringBuilder builder = new StringBuilder("Hello");
builder.append(" World");
builder.insert(5, "Java ");
builder.delete(0, 6);
builder.reverse();
System.out.println(builder.toString()); // Output: avaj dlroW
```
