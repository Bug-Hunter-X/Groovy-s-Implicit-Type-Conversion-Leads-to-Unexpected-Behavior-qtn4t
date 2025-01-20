```groovy
def myMethod(String input) {
  if (input == null) {
    return "Null input"
  } else if (input.length() == 0) {
    return "Empty input"
  } else {
    return input.toUpperCase()
  }
}

println myMethod(null) //This works as expected
println myMethod('') //This also works as expected
println myMethod("hello") //This works as expected

//But what if the input is a list?
println myMethod(["a","b","c"]) //This will not throw an exception and will return "[A,B,C]"
```