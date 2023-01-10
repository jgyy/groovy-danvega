// you must provide an assetion an expression that evaluates to true
Boolean boolt = true
assert boolt

// we can provide a full expression on the right hand side
// note that unlike Java and more like Ruby or Scala == is equality
int one = 1
assert one == 1

// like the example above we are evaluating an expression
int x = 1
assert x == 1

// what happens when the expression doesn't evaluate to true?
Boolean boolf = false
assert boolf

// The power assertion output shows evaluation results from the outer to the inner expression
assert one == 2

// complex debug output
BigDecimal calc = (3 + 10) * 100 / 5 * 20
assert calc == 1

// The power assertion statements true power unleashes in complex Boolean statements,
// or statements with collections or other toString-enabled classes:
int[] arr = [1, 2, 3, 4, 5]
assert (arr << 6) == [6, 7, 8, 9, 10]
