```groovy
def myMethod(String input) {
  if (input == null) {
    return "Null input"
  } else if (input.length() == 0) {
    return "Empty input"
  } else if (input instanceof String) {
    return input.toUpperCase()
  } else {
    return "Invalid input type"
  }
}

println myMethod(null) //This works as expected
println myMethod('') //This also works as expected
println myMethod("hello") //This works as expected
println myMethod(["a","b","c"]) //This now returns "Invalid input type"
```