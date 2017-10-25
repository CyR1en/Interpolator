### Proof of concept
# Variable Interpolation in Java.

### Description
**Interface** :  Interpolator

Used ReflectionAPI to query fields and used regex replacement for the actual interpolation.

With Interpolator you can get away with using System.out.printf() or String.format() by interfacing Interpolator to which ever class you want to use it to and just use printf().

### Implementation
Simply interface Interpolator to any class you wish to use Interpolator with and you can explicitly call printf().
```java
public class TestClass implements Interpolator {
  //code here
}
```

### Example
without Interpolator:
```java
String world = "world";
System.out.printf("hello %s", world);
```

with Interpolator:
```java
String world = "world";
printf("hello $world");
```

output with Interpolator:
```java
hello world
```

### Caveats
Accessing fields inside methods are not supported by ReflectionAPI since variables inside methods are explicit only to that method when it executes.
