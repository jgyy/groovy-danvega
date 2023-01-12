// Groovy Number Defaults
// ----------------------------------------------------------------------

int number = 10
println number.class

BigDecimal decimal = 5.50
println decimal.class

// :: Converting Data Types ::
// ----------------------------------------------------------------------
// Explicit - casting

BigDecimal myFloat = (float) 1.0
println myFloat.class

// Implicit - coercion

// Rules for +,-,*
// ----------------------------------------------------------------------

// If either operand is a float or a double the result is a double
// In Java if only floats are involved the result is a float

BigDecimal f = 5.25
BigDecimal d = 10.50

BigDecimal result = d / f
println result
println result.class

BigDecimal a = 10.75
BigDecimal b = 53.75
BigDecimal result2 = b / a
println result2
println result2.class

// If either operand is a big decimal

BigDecimal x = 34.5 // BigDecimal
BigDecimal y = 15
BigDecimal bigResult = x / y
println bigResult
println bigResult.class

// If either operand is a BigInteger the result is a BigInteger
// If either operand is a Long the result is a Long
// If either operand is a Integer the result is an Integer

// Double division
BigDecimal four = 4.1
println 5.0d - four
println 5 - four

// Integer Division

BigDecimal intDiv = 1 / 2
println intDiv // this is much different than Java where we would get 0
println intDiv.getClass().name
println 1.intdiv(2)

// GDK Methods
// ----------------------------------------------------------------------

assert 2.5.toInteger() == 2 // conversion
assert 2.5 as Integer == 2 // enforced coercion
assert (int) 2.5 == 2 // cast

assert '5.50'.number

// times | upto | downto | step

20.times {
    print '-'
}

1.upto(number) { num ->
    println num
}

number.downto(1) { num ->
    println num
}

0.step(1, 0.1) { num ->
    println num
}
